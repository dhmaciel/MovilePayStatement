package com.example.remote.home.repositories

import common.Result
import home.entities.Home

interface HomeRemoteDataSource {
    suspend fun getWidgetList(): Result<Home>
}