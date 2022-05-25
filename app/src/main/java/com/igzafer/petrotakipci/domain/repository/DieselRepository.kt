package com.igzafer.petrotakipci.domain.repository

import com.igzafer.petrotakipci.data.model.dizel.BaseDizelModel
import com.igzafer.petrotakipci.data.util.Resource

interface DieselRepository {
    suspend fun getDiesel(district: String,city: String): Resource<BaseDizelModel>

}