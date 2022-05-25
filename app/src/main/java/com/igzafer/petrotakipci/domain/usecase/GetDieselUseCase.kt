package com.igzafer.petrotakipci.domain.usecase

import com.igzafer.petrotakipci.domain.repository.BenzinRepository
import com.igzafer.petrotakipci.domain.repository.DieselRepository

class GetDieselUseCase(private val dieselRepository: DieselRepository) {
    suspend fun execute(district: String, city: String) = dieselRepository.getDiesel(district, city)
}