package com.example.movilepaystatement.di

import com.example.remote.home.HomeRemote
import retrofit2.http.GET

interface StatementService {
    @GET("interview/home")
    suspend fun getWidgetList(): HomeRemote
}