package com.example.remote.home.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.entities.ContentButton

@JsonClass(generateAdapter = true)
data class ContentActionRemote(
    @Json(name = "accountId")
    val accountId: String? = null,
    @Json(name = "cardId")
    val cardId: String? = null
)

fun ContentActionRemote.toDomain() = ContentButton (
    accountId = accountId,
    cardId = cardId
)