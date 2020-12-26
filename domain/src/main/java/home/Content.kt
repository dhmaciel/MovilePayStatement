package home

import java.io.Serializable

data class Content(
    val balance: Balance,
    val button: Button,
    val cardNumber: String,
    val title: String
) : Serializable
