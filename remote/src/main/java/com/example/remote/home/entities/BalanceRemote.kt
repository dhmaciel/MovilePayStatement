package com.example.remote.home.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.entities.Balance

data class BalanceRemote(
    @Json(name = "label")
    val label: String,
    @Json(name = "value")
    val value: String
)

fun BalanceRemote.toDomain() = Balance(
    label = label,
    value = value
)