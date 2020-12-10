package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ButtonRemote(
    @Json(name = "action")
    val action: ActionRemote,
    @Json(name = "text")
    val text: String
)