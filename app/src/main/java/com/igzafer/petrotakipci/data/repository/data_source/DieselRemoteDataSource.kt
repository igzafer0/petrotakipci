package com.igzafer.petrotakipci.data.repository.data_source

import com.igzafer.petrotakipci.data.model.dizel.BaseDizelModel
import retrofit2.Response

interface DieselRemoteDataSource {
    suspend fun getDiesel(district: String,city: String): Response<BaseDizelModel>

}