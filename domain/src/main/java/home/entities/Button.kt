package home.entities

import java.io.Serializable

data class Button(
    val text: String,
    val action: Action
): Serializable