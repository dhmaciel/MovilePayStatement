package com.example.core.services.network

import retrofit2.http.GET

interface StatementService {
    @GET("interview/home")
    suspend fun getWidgetList(): Unit
}