package com.example.core.services.network.retrofit

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun buildRetrofitWith(
    isDebug: Boolean = false,
    host: String
): Retrofit = retrofitClient(
    host = host,
    httpClient = httpClient(
        isDebug
    )
)

private fun httpClient(
    isDebug: Boolean
): OkHttpClient =
    OkHttpClient.Builder().run {

        if (isDebug) {
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
                addInterceptor(this)
            }
        }

        build()
    }

private fun retrofitClient(
    host: String,
    httpClient: OkHttpClient
): Retrofit =
    Retrofit.Builder()
        .baseUrl(host)
        .client(httpClient)
        .addConverterFactory(
            MoshiConverterFactory.create(getMoshi())
        )
        .build()

private fun getMoshi() =
    Moshi.Builder().add(KotlinJsonAdapterFactory()).build()