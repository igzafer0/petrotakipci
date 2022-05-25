package com.igzafer.petrotakipci.presentation.di

import com.igzafer.petrotakipci.data.api.ApiService
import com.igzafer.petrotakipci.data.repository.data_source.BenzinRemoteDataSource
import com.igzafer.petrotakipci.data.repository.data_source.DieselRemoteDataSource
import com.igzafer.petrotakipci.data.repository.data_source.LpgRemoteDataSource
import com.igzafer.petrotakipci.data.repository.data_source_ımpl.BenzinRemoteDataSourceImpl
import com.igzafer.petrotakipci.data.repository.data_source_ımpl.DieselRemoteDataSourceImpl
import com.igzafer.petrotakipci.data.repository.data_source_ımpl.LpgRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideBenzinRemoteDataSource(apiService: ApiService): BenzinRemoteDataSource {
        return BenzinRemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideDieselRemoteDataSource(apiService: ApiService): DieselRemoteDataSource {
        return DieselRemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideLpgRemoteDataSource(apiService: ApiService): LpgRemoteDataSource {
        return LpgRemoteDataSourceImpl(apiService)
    }
}