package com.igzafer.petrotakipci.data.repository.data_source

import com.igzafer.petrotakipci.data.model.benzin.BaseBenzinModel
import retrofit2.Response

interface BenzinRemoteDataSource {
    suspend fun getBenzin(district: String,city: String): Response<BaseBenzinModel>
}