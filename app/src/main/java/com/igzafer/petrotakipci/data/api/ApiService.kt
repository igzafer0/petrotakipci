package com.igzafer.petrotakipci.data.api

import com.igzafer.petrotakipci.BuildConfig
import com.igzafer.petrotakipci.data.model.benzin.BaseBenzinModel
import com.igzafer.petrotakipci.data.model.dizel.BaseDizelModel
import com.igzafer.petrotakipci.data.model.lpg.BaseLpgModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @Headers("authorization: ${BuildConfig.API_KEY}")
    @GET("turkeyGasoline")
    suspend fun getGasoline(
        @Query("district") district: String,
        @Query("city") city: String,
    ): Response<BaseBenzinModel>

    @Headers("authorization: ${BuildConfig.API_KEY}")
    @GET("turkeyDiesel")
    suspend fun getDiesel(
        @Query("district") district: String,
        @Query("city") city: String,
    ): Response<BaseDizelModel>

    @Headers("authorization: ${BuildConfig.API_KEY}")
    @GET("turkeyLpg")
    suspend fun getLpg(
        @Query("city") city: String,
    ): Response<BaseLpgModel>
}