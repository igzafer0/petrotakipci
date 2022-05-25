package com.igzafer.petrotakipci.presentation.di

import android.app.Application
import com.igzafer.petrotakipci.domain.usecase.GetBenzinUseCase
import com.igzafer.petrotakipci.domain.usecase.GetDieselUseCase
import com.igzafer.petrotakipci.domain.usecase.GetLpgUseCase
import com.igzafer.petrotakipci.presentation.view_model.HomeFragmentViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideHomeFragmentViewModelFactory(
        application: Application,
        getBenzinUseCase: GetBenzinUseCase,
        getDieselUseCase: GetDieselUseCase,
        getLpgUseCase: GetLpgUseCase,
        ): HomeFragmentViewModelFactory {
        return HomeFragmentViewModelFactory(
            application,
            getBenzinUseCase,
            getDieselUseCase,
            getLpgUseCase
        )
    }
}