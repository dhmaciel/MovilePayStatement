package home

import java.io.Serializable

data class Button(
    val text: String,
    val action: Action
): Serializable