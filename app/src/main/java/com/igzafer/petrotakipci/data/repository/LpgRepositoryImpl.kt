package com.igzafer.petrotakipci.data.repository

import com.igzafer.petrotakipci.data.model.lpg.BaseLpgModel
import com.igzafer.petrotakipci.data.repository.data_source.LpgRemoteDataSource
import com.igzafer.petrotakipci.data.util.Resource
import com.igzafer.petrotakipci.domain.repository.LpgRepository
import retrofit2.Response

class LpgRepositoryImpl(private val lpgRemoteDataSource: LpgRemoteDataSource) :
    LpgRepository {
    override suspend fun getLpg(city: String): Resource<BaseLpgModel> {
        return responseToResource(lpgRemoteDataSource.getLpg(city))
    }

    private fun responseToResource(response: Response<BaseLpgModel>): Resource<BaseLpgModel> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }
}