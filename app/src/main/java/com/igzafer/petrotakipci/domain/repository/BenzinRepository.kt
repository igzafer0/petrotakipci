package com.igzafer.petrotakipci.domain.repository

import com.igzafer.petrotakipci.data.model.benzin.BaseBenzinModel
import com.igzafer.petrotakipci.data.util.Resource

interface BenzinRepository {
    suspend fun getBenzin(district: String,city: String): Resource<BaseBenzinModel>
}