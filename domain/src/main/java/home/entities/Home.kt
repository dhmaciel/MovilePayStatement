package home.entities

import java.io.Serializable

data class Home(
    val widgets: List<Widgets>
) : Serializable