package com.igzafer.petrotakipci.domain.repository

import com.igzafer.petrotakipci.data.model.lpg.BaseLpgModel
import com.igzafer.petrotakipci.data.util.Resource

interface LpgRepository {
    suspend fun getLpg(city: String): Resource<BaseLpgModel>

}