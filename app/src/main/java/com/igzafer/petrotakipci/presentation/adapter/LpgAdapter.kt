package com.igzafer.petrotakipci.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.igzafer.petrotakipci.data.model.lpg.LpgPriceModel
import com.igzafer.petrotakipci.databinding.AkaryakitRowBinding

class LpgAdapter :
    RecyclerView.Adapter<LpgAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: AkaryakitRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: LpgPriceModel) {
            binding.nameTw.text = data.marka
            binding.logoTw.text = data.marka.subSequence(0,1)
            binding.nameTw.text = data.lpg.toString()
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = differ.currentList[position]

        holder.bind(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            AkaryakitRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    private val callback = object : DiffUtil.ItemCallback<LpgPriceModel>() {
        override fun areItemsTheSame(
            oldItem: LpgPriceModel,
            newItem: LpgPriceModel
        ): Boolean {
            return oldItem.marka == newItem.marka
        }

        override fun areContentsTheSame(
            oldItem: LpgPriceModel,
            newItem: LpgPriceModel
        ): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this, callback)
    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}