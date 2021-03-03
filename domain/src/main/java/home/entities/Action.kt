package home.entities

import java.io.Serializable

data class Action (
    val identifier: String,
    val content: ContentButton
): Serializable
