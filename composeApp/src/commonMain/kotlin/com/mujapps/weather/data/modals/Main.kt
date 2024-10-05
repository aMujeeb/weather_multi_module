package com.mujapps.weather.data.modals

import kotlinx.serialization.Serializable

@Serializable
data class Main(
    val humidity: Int?,
    val pressure: Int?,
    val temp: Double?,
    val temp_max: Double?,
    val temp_min: Double?
)