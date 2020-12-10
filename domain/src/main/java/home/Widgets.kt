package home

import java.io.Serializable

data class Widgets(
    val identifier: String,
    val content: Content
) : Serializable