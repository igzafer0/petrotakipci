package com.igzafer.petrotakipci.domain.usecase

import com.igzafer.petrotakipci.domain.repository.BenzinRepository

class GetBenzinUseCase(private val benzinRepository: BenzinRepository) {
    suspend fun execute(district: String, city: String) = benzinRepository.getBenzin(district, city)
}