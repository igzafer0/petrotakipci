package com.igzafer.petrotakipci.data.model.benzin


data class BaseBenzinModel(
    val lastupdate: String,
    val result: List<BenzinResultModel>,
    val success: Boolean
)