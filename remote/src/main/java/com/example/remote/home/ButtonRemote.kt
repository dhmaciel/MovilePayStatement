package com.example.remote.home


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import home.Button

@JsonClass(generateAdapter = true)
data class ButtonRemote(
    @Json(name = "action")
    val action: ActionRemote,
    @Json(name = "text")
    val text: String
)

fun ButtonRemote.toDomain() = Button(
    text = text,
    action = action.toDomain()
)