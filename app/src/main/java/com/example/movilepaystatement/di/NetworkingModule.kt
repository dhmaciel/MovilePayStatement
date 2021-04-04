package com.example.movilepaystatement.di

import com.example.core.services.network.retrofit.buildRetrofitWith
import com.example.remote.home.api.HomeApi
import org.koin.dsl.module
import retrofit2.Retrofit

val networkingModule = module {
    single {
        buildRetrofitWith(isDebug = true, host = "https://mpay-android-interview.herokuapp.com/android/") //TODO: Change it.
    }

    factory { get<Retrofit>().create(HomeApi::class.java) }
}