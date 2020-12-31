package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.Action

@JsonClass(generateAdapter = true)
data class ActionRemote(
    @Json(name = "content")
    val content: ContentActionRemote,
    @Json(name = "identifier")
    val identifier: String
)

fun ActionRemote.toDomain() = Action(
    identifier = identifier,
    content = content.toDomain()
)