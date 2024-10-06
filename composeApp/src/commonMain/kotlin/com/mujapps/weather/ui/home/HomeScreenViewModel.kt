package com.mujapps.weather.ui.home

import androidx.lifecycle.ViewModel
import com.mujapps.weather.data.modals.WeatherResponse
import com.mujapps.weather.data.repository.WeatherRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeScreenViewModel(private val mRepository : WeatherRepository) : ViewModel() {

    private val _state = MutableStateFlow<HomeScreenState>(HomeScreenState.Loading)
    val mState = _state.asStateFlow()

    fun fetchWeather(city: String) {
        CoroutineScope(Dispatchers.IO).launch {
            _state.value = HomeScreenState.Loading
            try {
                val result = mRepository.fetchWeather(city)
                _state.value = HomeScreenState.Success(result)
            } catch (e: Exception) {
                println(e)
                _state.value = HomeScreenState.Error("Data Fetch error")
            }
        }
    }
}

sealed class HomeScreenState() {
    data class Success(val data: WeatherResponse) : HomeScreenState()
    data class Error(val message: String) : HomeScreenState()
    data object Loading : HomeScreenState()
}