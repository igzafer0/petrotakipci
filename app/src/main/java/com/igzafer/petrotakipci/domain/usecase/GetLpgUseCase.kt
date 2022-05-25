package com.igzafer.petrotakipci.domain.usecase

import com.igzafer.petrotakipci.domain.repository.BenzinRepository
import com.igzafer.petrotakipci.domain.repository.LpgRepository

class GetLpgUseCase(private val lpgRepository: LpgRepository) {
    suspend fun execute(city: String) = lpgRepository.getLpg(city)
}