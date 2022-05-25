package com.igzafer.petrotakipci.data.repository

import com.igzafer.petrotakipci.data.model.benzin.BaseBenzinModel
import com.igzafer.petrotakipci.data.repository.data_source.BenzinRemoteDataSource
import com.igzafer.petrotakipci.data.util.Resource
import com.igzafer.petrotakipci.domain.repository.BenzinRepository
import retrofit2.Response

class BenzinRepositoryImpl(private val benzinRemoteDataSource: BenzinRemoteDataSource) :
    BenzinRepository {
    override suspend fun getBenzin(district: String, city: String): Resource<BaseBenzinModel> {
        return responseToResource(benzinRemoteDataSource.getBenzin(district, city))
    }

    private fun responseToResource(response: Response<BaseBenzinModel>): Resource<BaseBenzinModel> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }
}