package com.gabutproject.mars_rent.network

import com.squareup.moshi.Json

data class MarsProperty(
    val id: String,
    @Json(name = "img_src") val imgSrcUri: String,
    val type: String,
    val price: Double
)