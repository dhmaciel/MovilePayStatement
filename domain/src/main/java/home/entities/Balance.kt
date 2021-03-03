package home.entities

import java.io.Serializable

data class Balance(
    val label: String,
    val value: String
) : Serializable
