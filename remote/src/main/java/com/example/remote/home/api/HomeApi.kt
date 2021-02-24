package com.example.remote.home.api

import com.example.remote.home.entities.HomeRemote
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {
    @GET("interview/home")
    suspend fun getWidgetList(): Response<HomeRemote>
}