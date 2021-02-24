package home.repositories

import common.Result
import home.entities.Home

interface HomeRepository {
    suspend fun getWidgetList(): Result<Home>
}