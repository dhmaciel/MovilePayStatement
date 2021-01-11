package com.example.movilepaystatement.di

import com.example.core.services.network.retrofit.buildRetrofitWith
import org.koin.dsl.module
import retrofit2.Retrofit

val networkingModule = module {
    single {
        buildRetrofitWith(isDebug = true, host = "") //TODO: Change it.
    }

    factory { get<Retrofit>().create(StatementService::class.java) }
}