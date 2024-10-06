package com.mujapps.weather

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.mujapps.weather.ui.home.HomeScreen
import com.mujapps.weather.ui.home.HomeScreenViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(viewModel: HomeScreenViewModel) {
    MaterialTheme {
        HomeScreen(viewModel)
    }
}