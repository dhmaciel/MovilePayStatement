package com.example.remote.home.repositories

import home.repositories.HomeRepository

class HomeRepositoryImpl(private val homeRemoteDataSource: HomeRemoteDataSource) : HomeRepository {
    override suspend fun getWidgetList() =
        homeRemoteDataSource.getWidgetList()
}
