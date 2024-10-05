package com.mujapps.weather.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mujapps.weather.data.modals.WeatherResponse

@Composable
fun LoadingScreen() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        CircularProgressIndicator()
    }
}

@Composable
fun HomeContent(weatherResponse: WeatherResponse) {
    Column(modifier = Modifier.fillMaxSize().background(Color.Blue.copy(alpha = 0.2f)).systemBarsPadding(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(weatherResponse.name ?: "-")
        Text(weatherResponse.weather?.get(0)?.main.toString() ?: "-")
    }
}

@Composable
fun ErrorScreen(error: String) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Error Occurred $error")
    }
}