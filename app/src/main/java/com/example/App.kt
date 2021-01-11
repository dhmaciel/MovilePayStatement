package com.example

import android.app.Application
import com.example.movilepaystatement.di.networkingModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initiateKoin()
    }

    private fun initiateKoin() {
        startKoin {
            androidContext(this@App)
            modules(networkingModule)
        }
    }
}