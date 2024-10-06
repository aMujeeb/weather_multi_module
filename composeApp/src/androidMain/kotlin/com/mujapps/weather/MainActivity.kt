package com.mujapps.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mujapps.weather.ui.home.HomeScreenViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel : HomeScreenViewModel = getViewModel()
        setContent {
            App(viewModel)
            viewModel.fetchWeather("London")
        }
    }
}