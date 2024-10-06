package com.mujapps.weather.data.network

import com.mujapps.weather.data.modals.WeatherResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ApiService(private val mHttpClient: HttpClient) {
    private val mBaseUrl = "https://api.openweathermap.org/data/2.5/weather?q="

    suspend fun getWeather(city: String): WeatherResponse {
        return mHttpClient.get("$mBaseUrl$city&appid=xxxxx").body()
    }
}