package com.example.remote.home.entities


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.entities.Home

data class HomeRemote(
    @Json(name = "widgets")
    val widgets: List<WidgetRemote>
)

fun HomeRemote.toDomain() = Home(
    widgets = widgets.map { it.toDomain() }
)