package com.mujapps.weather.di

import com.mujapps.weather.data.network.ApiService
import com.mujapps.weather.data.repository.WeatherRepository
import com.mujapps.weather.ui.home.HomeScreenViewModel
import org.koin.dsl.module

val weatherModule = module {
    single<ApiService> {
        ApiService(get())
    }

    single<WeatherRepository> {
        WeatherRepository(get())
    }

    single<HomeScreenViewModel> {
        HomeScreenViewModel(get())
    }
}