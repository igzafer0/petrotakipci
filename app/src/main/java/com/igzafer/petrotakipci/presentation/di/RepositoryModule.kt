package com.igzafer.petrotakipci.presentation.di

import com.igzafer.petrotakipci.data.repository.BenzinRepositoryImpl
import com.igzafer.petrotakipci.data.repository.DieselRepositoryImpl
import com.igzafer.petrotakipci.data.repository.LpgRepositoryImpl
import com.igzafer.petrotakipci.data.repository.data_source.BenzinRemoteDataSource
import com.igzafer.petrotakipci.data.repository.data_source.DieselRemoteDataSource
import com.igzafer.petrotakipci.data.repository.data_source.LpgRemoteDataSource
import com.igzafer.petrotakipci.domain.repository.BenzinRepository
import com.igzafer.petrotakipci.domain.repository.DieselRepository
import com.igzafer.petrotakipci.domain.repository.LpgRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideBenzinRepository(
        benzinRemoteDataSource: BenzinRemoteDataSource,
    ): BenzinRepository {
        return BenzinRepositoryImpl(benzinRemoteDataSource)
    }

    @Singleton
    @Provides
    fun provideDieselRepository(
        dieselRemoteDataSource: DieselRemoteDataSource,
    ): DieselRepository {
        return DieselRepositoryImpl(dieselRemoteDataSource)
    }

    @Singleton
    @Provides
    fun provideLpgRepository(
        lpgRemoteDataSource: LpgRemoteDataSource,
    ): LpgRepository {
        return LpgRepositoryImpl(lpgRemoteDataSource)
    }
}