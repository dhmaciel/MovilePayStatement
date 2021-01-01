package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.Content

@JsonClass(generateAdapter = true)
data class ContentRemote(
    @Json(name = "balance")
    val balance: BalanceRemote? = null,
    @Json(name = "button")
    val button: ButtonRemote? = null,
    @Json(name = "cardNumber")
    val cardNumber: String? = null,
    @Json(name = "title")
    val title: String
)

fun ContentRemote.toDomain() =  Content(
    balance = balance?.toDomain(),
    button = button?.toDomain(),
    cardNumber = cardNumber,
    title = title
)