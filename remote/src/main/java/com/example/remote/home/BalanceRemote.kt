package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BalanceRemote(
    @Json(name = "label")
    val label: String,
    @Json(name = "value")
    val value: String
)