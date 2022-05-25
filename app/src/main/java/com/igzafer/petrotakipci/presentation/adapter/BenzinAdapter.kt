package com.igzafer.petrotakipci.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.igzafer.petrotakipci.data.model.benzin.BenzinResultModel
import com.igzafer.petrotakipci.databinding.AkaryakitRowBinding

class BenzinAdapter :
    RecyclerView.Adapter<BenzinAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: AkaryakitRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: BenzinResultModel) {
            binding.nameTw.text = data.marka
            binding.logoTw.text = data.marka.subSequence(0,1)
            binding.priceTw.text = data.benzin.toString()
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

    private val callback = object : DiffUtil.ItemCallback<BenzinResultModel>() {
        override fun areItemsTheSame(
            oldItem: BenzinResultModel,
            newItem: BenzinResultModel
        ): Boolean {
            return oldItem.benzin == newItem.benzin
        }

        override fun areContentsTheSame(
            oldItem: BenzinResultModel,
            newItem: BenzinResultModel
        ): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this, callback)
    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}