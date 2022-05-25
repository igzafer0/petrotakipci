package com.igzafer.petrotakipci.data.repository.data_source_ımpl

import com.igzafer.petrotakipci.data.api.ApiService
import com.igzafer.petrotakipci.data.model.benzin.BaseBenzinModel
import com.igzafer.petrotakipci.data.repository.data_source.BenzinRemoteDataSource
import retrofit2.Response

class BenzinRemoteDataSourceImpl(val apiService: ApiService) : BenzinRemoteDataSource {
    override suspend fun getBenzin(district: String, city: String): Response<BaseBenzinModel> {
        return apiService.getGasoline(district, city)
    }
}