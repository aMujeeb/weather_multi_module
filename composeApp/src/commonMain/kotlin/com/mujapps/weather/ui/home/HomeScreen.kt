package com.mujapps.weather.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mujapps.weather.ui.components.ErrorScreen
import com.mujapps.weather.ui.components.HomeContent
import com.mujapps.weather.ui.components.LoadingScreen

@Composable
fun HomeScreen(viewModel : HomeScreenViewModel) {

    val state = viewModel.mState.collectAsState()

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        when (state.value) {
            is HomeScreenState.Error -> {
                ErrorScreen((state.value as HomeScreenState.Error).message)
            }

            is HomeScreenState.Loading -> {
                LoadingScreen()
            }

            is HomeScreenState.Success -> {
                HomeContent((state.value as HomeScreenState.Success).data)
            }
        }
    }
}