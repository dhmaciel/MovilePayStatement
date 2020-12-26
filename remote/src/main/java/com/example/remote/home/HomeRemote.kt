package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.Home
import home.Widgets

@JsonClass(generateAdapter = true)
data class HomeRemote(
    @Json(name = "widgets")
    val widgets: List<WidgetRemote>
)

fun HomeRemote.toDomain() = Home(

)