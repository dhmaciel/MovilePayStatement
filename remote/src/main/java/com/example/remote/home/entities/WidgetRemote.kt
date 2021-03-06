package com.example.remote.home.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.entities.Widgets

data class WidgetRemote(
    @Json(name = "content")
    val content: ContentRemote,
    @Json(name = "identifier")
    val identifier: String
)

fun WidgetRemote.toDomain() =
    Widgets(
        identifier = this.identifier,
        content = this.content.toDomain()
    )