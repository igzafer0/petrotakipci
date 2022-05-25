package com.igzafer.petrotakipci.presentation.view_model

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.igzafer.petrotakipci.domain.usecase.GetBenzinUseCase
import com.igzafer.petrotakipci.domain.usecase.GetDieselUseCase
import com.igzafer.petrotakipci.domain.usecase.GetLpgUseCase

@Suppress("UNCHECKED_CAST")
class HomeFragmentViewModelFactory(
    private val app: Application,
    private val getBenzinUseCase: GetBenzinUseCase,
    private val getDieselUseCase: GetDieselUseCase,
    private val getLpgUseCase: GetLpgUseCase

) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeFragmentViewModel(
            app,
            getBenzinUseCase,
            getDieselUseCase,
            getLpgUseCase
        ) as T
    }

}