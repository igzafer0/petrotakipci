package com.igzafer.petrotakipci.data.model.dizel


data class BaseDizelModel(
    val lastupdate: String,
    val result: List<DizelResultModel>,
    val success: Boolean
)