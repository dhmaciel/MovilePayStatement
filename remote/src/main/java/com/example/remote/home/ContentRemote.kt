package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContentRemote(
    @Json(name = "balance")
    val balance: BalanceRemote,
    @Json(name = "button")
    val button: ButtonRemote,
    @Json(name = "cardNumber")
    val cardNumber: String,
    @Json(name = "title")
    val title: String
)