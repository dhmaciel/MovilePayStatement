package com.example.movilepaystatement.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import common.Result
import home.entities.Home
import home.usecases.HomeUseCase
import kotlinx.coroutines.launch

class HomeViewModel(private val homeUseCase: HomeUseCase) : ViewModel() {

    private val dataLoading = MutableLiveData(true)
    fun dataLoading(): LiveData<Boolean> = dataLoading

    private val home = MutableLiveData<Home>()
    fun home(): LiveData<Home> = home

    private val error = MutableLiveData<String>()
    fun error(): LiveData<String> = error

    fun fetchHomeWidgets() {
        viewModelScope.launch {
            dataLoading.postValue(true)
            when (val homeResult = homeUseCase.invoke()) {
                is Result.Success -> {
                    home.postValue(homeResult.data)
                    dataLoading.postValue(false)
                }
                is Result.Error -> {
                    error.postValue(homeResult.exception.message)
                    dataLoading.postValue(false)
                }
            }
        }
    }
}