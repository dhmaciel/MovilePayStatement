package com.example.remote.home.repositories

import com.example.remote.home.api.HomeApi
import com.example.remote.home.entities.toDomain
import common.Result
import home.entities.Home
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HomeRemoteDataSourceImpl(private val homeApi: HomeApi) : HomeRemoteDataSource {
    override suspend fun getWidgetList(): Result<Home> =
        withContext(Dispatchers.IO) {
            try {
                val response = homeApi.getWidgetList()
                response.body()?.let {
                    if (response.isSuccessful) {
                        return@withContext Result.Success(it.toDomain())
                    } else {
                        return@withContext Result.Error(Exception(response.message()))
                    }
                } ?: return@withContext Result.Error(Exception("No data available"))
            } catch (e: Exception) {
                return@withContext Result.Error(e)
            }
        }
}