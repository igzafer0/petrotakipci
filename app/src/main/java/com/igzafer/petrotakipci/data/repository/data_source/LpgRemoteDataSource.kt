package com.igzafer.petrotakipci.data.repository.data_source

import com.igzafer.petrotakipci.data.model.lpg.BaseLpgModel
import retrofit2.Response

interface LpgRemoteDataSource {
    suspend fun getLpg(city: String): Response<BaseLpgModel>
}