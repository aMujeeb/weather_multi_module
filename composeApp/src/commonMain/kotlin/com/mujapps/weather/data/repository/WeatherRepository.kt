package com.mujapps.weather.data.repository

import com.mujapps.weather.data.network.ApiService

class WeatherRepository(private val mApiService : ApiService) {
    suspend fun fetchWeather(city : String) = mApiService.getWeather(city)
}