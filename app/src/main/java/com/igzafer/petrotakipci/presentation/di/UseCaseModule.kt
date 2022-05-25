package com.igzafer.petrotakipci.presentation.di

import com.igzafer.petrotakipci.data.repository.BenzinRepositoryImpl
import com.igzafer.petrotakipci.domain.repository.BenzinRepository
import com.igzafer.petrotakipci.domain.repository.DieselRepository
import com.igzafer.petrotakipci.domain.repository.LpgRepository
import com.igzafer.petrotakipci.domain.usecase.GetBenzinUseCase
import com.igzafer.petrotakipci.domain.usecase.GetDieselUseCase
import com.igzafer.petrotakipci.domain.usecase.GetLpgUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetBenzinUseCase(
        getBenzinRepository: BenzinRepository
    ): GetBenzinUseCase {
        return GetBenzinUseCase(getBenzinRepository)
    }

    @Singleton
    @Provides
    fun provideGetDieselUseCase(
        getDieselRepository: DieselRepository
    ): GetDieselUseCase {
        return GetDieselUseCase(getDieselRepository)
    }

    @Singleton
    @Provides
    fun provideGetLpgUseCase(
        getLpgRepository: LpgRepository
    ): GetLpgUseCase {
        return GetLpgUseCase(getLpgRepository)
    }
}