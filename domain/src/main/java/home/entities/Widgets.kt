package home.entities

import java.io.Serializable

data class Widgets(
    val identifier: String,
    val content: Content
) : Serializable