package com.example.movilepaystatement.di

import com.example.movilepaystatement.ui.HomeViewModel
import com.example.remote.home.repositories.HomeRemoteDataSource
import com.example.remote.home.repositories.HomeRemoteDataSourceImpl
import com.example.remote.home.repositories.HomeRepositoryImpl
import home.repositories.HomeRepository
import home.usecases.HomeUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    viewModel { HomeViewModel(get()) }

    factory { HomeUseCase(get()) }

    single<HomeRepository> { HomeRepositoryImpl(get())  }
    single<HomeRemoteDataSource> {  HomeRemoteDataSourceImpl(get()) }
}