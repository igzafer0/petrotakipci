package com.igzafer.petrotakipci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.igzafer.petrotakipci.databinding.ActivityMainBinding
import com.igzafer.petrotakipci.presentation.adapter.BenzinAdapter
import com.igzafer.petrotakipci.presentation.adapter.DieselAdapter
import com.igzafer.petrotakipci.presentation.adapter.LpgAdapter
import com.igzafer.petrotakipci.presentation.view_model.HomeFragmentViewModel
import com.igzafer.petrotakipci.presentation.view_model.HomeFragmentViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@Suppress("DEPRECATION")
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var homeFragmentViewModelFactory: HomeFragmentViewModelFactory
    @Inject
    lateinit var recyAdapterBenzin: BenzinAdapter
    @Inject
    lateinit var recyAdapterDiesel: DieselAdapter
    @Inject
    lateinit var recyAdapterLpg: LpgAdapter

    private lateinit var binding: ActivityMainBinding
    lateinit var homeFragmentViewModel: HomeFragmentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        homeFragmentViewModel = ViewModelProvider(
            this,
            homeFragmentViewModelFactory
        )[HomeFragmentViewModel::class.java]
    }
}