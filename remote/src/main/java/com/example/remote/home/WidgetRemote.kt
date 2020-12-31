package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.Widgets

@JsonClass(generateAdapter = true)
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