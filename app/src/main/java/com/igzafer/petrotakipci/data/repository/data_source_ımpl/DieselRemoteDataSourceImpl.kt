package com.igzafer.petrotakipci.data.repository.data_source_ımpl

import com.igzafer.petrotakipci.data.api.ApiService
import com.igzafer.petrotakipci.data.model.dizel.BaseDizelModel
import com.igzafer.petrotakipci.data.repository.data_source.DieselRemoteDataSource
import retrofit2.Response

class DieselRemoteDataSourceImpl(val apiService: ApiService):DieselRemoteDataSource {
    override suspend fun getDiesel(district: String, city: String): Response<BaseDizelModel> {
        return apiService.getDiesel(district, city)

    }
}