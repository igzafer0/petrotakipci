package com.igzafer.petrotakipci.presentation.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.liveData
import com.igzafer.petrotakipci.domain.usecase.GetBenzinUseCase
import com.igzafer.petrotakipci.domain.usecase.GetDieselUseCase
import com.igzafer.petrotakipci.domain.usecase.GetLpgUseCase

class HomeFragmentViewModel(
    private val app: Application,
    private val getBenzinUseCase: GetBenzinUseCase,
    private val getDieselUseCase: GetDieselUseCase,
    private val getLpgUseCase: GetLpgUseCase
) : AndroidViewModel(app) {
    suspend fun getBenzin(district: String, city: String) = getBenzinUseCase.execute(district, city)
    suspend fun getDiesel(district: String, city: String) = getDieselUseCase.execute(district, city)
    suspend fun getLpg(city: String) = getLpgUseCase.execute(city)
}