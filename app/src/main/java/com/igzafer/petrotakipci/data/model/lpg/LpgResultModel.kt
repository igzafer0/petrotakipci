package com.igzafer.petrotakipci.data.model.lpg


data class LpgResultModel(
    val lastupdate: String,
    val price: List<LpgPriceModel>
)