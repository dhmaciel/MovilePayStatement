package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ActionRemote(
    @Json(name = "content")
    val content: ContentActionRemote,
    @Json(name = "identifier")
    val identifier: String
)