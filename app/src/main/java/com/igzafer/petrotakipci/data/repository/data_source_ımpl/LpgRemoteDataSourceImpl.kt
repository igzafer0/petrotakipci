package com.igzafer.petrotakipci.data.repository.data_source_ımpl

import com.igzafer.petrotakipci.data.api.ApiService
import com.igzafer.petrotakipci.data.model.lpg.BaseLpgModel
import com.igzafer.petrotakipci.data.repository.data_source.LpgRemoteDataSource
import retrofit2.Response

class LpgRemoteDataSourceImpl(val apiService: ApiService):LpgRemoteDataSource {
    override suspend fun getLpg(city: String): Response<BaseLpgModel> {
        return apiService.getLpg(city)
    }
}