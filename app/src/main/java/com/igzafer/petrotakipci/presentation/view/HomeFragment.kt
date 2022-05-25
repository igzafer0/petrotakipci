package com.igzafer.petrotakipci.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.igzafer.petrotakipci.MainActivity
import com.igzafer.petrotakipci.R
import com.igzafer.petrotakipci.databinding.FragmentHomeBinding
import com.igzafer.petrotakipci.presentation.adapter.BenzinAdapter
import com.igzafer.petrotakipci.presentation.adapter.DieselAdapter
import com.igzafer.petrotakipci.presentation.adapter.LpgAdapter
import com.igzafer.petrotakipci.presentation.view_model.HomeFragmentViewModel


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private lateinit var binding: FragmentHomeBinding
    lateinit var viewModel: HomeFragmentViewModel
    private lateinit var benzinAdapter: BenzinAdapter
    private lateinit var dieselAdapter: DieselAdapter
    private lateinit var lpgAdapter: LpgAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        viewModel = (activity as MainActivity).homeFragmentViewModel
        benzinAdapter = (activity as MainActivity).recyAdapterBenzin
        dieselAdapter = (activity as MainActivity).recyAdapterDiesel
        lpgAdapter = (activity as MainActivity).recyAdapterLpg
        initRecy()
        getData("kadikoy","istanbul")
        binding.searchIm.setOnClickListener {
           val x = binding.searchEt.text.split(",")
            getData(x[0],x[1].trim())
        }

    }

    private fun getData(district: String, city: String) {
        lifecycleScope.launchWhenCreated {
            benzinAdapter.differ.submitList(
                viewModel.getBenzin(district, city).data!!.result
            )
        }
        lifecycleScope.launchWhenCreated {
            dieselAdapter.differ.submitList(
                viewModel.getDiesel(district, city).data!!.result
            )
        }

    }

    private fun initRecy() {
        binding.benzinRecy.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = benzinAdapter
        }
        binding.dizelRecy.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = dieselAdapter
        }
        binding.lpgRecy.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = lpgAdapter
        }
    }
}