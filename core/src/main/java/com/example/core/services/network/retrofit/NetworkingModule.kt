package com.example.core.services.network.retrofit

import com.example.core.services.network.StatementService
import org.koin.dsl.module
import retrofit2.Retrofit

val networkingModule = module {
    single {
        buildRetrofitWith(isDebug = true, host = "") //TODO: Change it.
    }

    factory { get<Retrofit>().create(StatementService::class.java) }
}