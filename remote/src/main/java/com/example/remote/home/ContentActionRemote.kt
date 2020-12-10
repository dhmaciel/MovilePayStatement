package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContentActionRemote(
    @Json(name = "accountId")
    val accountId: String,
    @Json(name = "cardId")
    val cardId: String
)