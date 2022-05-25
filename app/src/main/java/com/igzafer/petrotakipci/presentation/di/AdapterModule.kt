package com.igzafer.petrotakipci.presentation.di

import com.igzafer.petrotakipci.presentation.adapter.BenzinAdapter
import com.igzafer.petrotakipci.presentation.adapter.DieselAdapter
import com.igzafer.petrotakipci.presentation.adapter.LpgAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {
    @Singleton
    @Provides
    fun provideBenzinAdapter(): BenzinAdapter {
        return BenzinAdapter()
    }
    @Singleton
    @Provides
    fun provideDieselAdapter(): DieselAdapter {
        return DieselAdapter()
    }
    @Singleton
    @Provides
    fun provideLpgAdapter(): LpgAdapter {
        return LpgAdapter()
    }

}