package home.entities

import java.io.Serializable

data class Content(
    val balance: Balance? = null,
    val button: Button? = null,
    val cardNumber: String? = null,
    val title: String
) : Serializable
