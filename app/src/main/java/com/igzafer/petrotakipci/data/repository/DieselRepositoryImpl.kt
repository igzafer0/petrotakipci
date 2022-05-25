package com.igzafer.petrotakipci.data.repository

import com.igzafer.petrotakipci.data.model.dizel.BaseDizelModel
import com.igzafer.petrotakipci.data.repository.data_source.DieselRemoteDataSource
import com.igzafer.petrotakipci.data.util.Resource
import com.igzafer.petrotakipci.domain.repository.DieselRepository
import retrofit2.Response

class DieselRepositoryImpl(private val dieselRemoteDataSource: DieselRemoteDataSource) :
    DieselRepository {
    override suspend fun getDiesel(district: String, city: String): Resource<BaseDizelModel> {
        return responseToResource(dieselRemoteDataSource.getDiesel(district, city))
    }

    private fun responseToResource(response: Response<BaseDizelModel>): Resource<BaseDizelModel> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }
}