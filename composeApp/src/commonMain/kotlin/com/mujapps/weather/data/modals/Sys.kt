package com.mujapps.weather.data.modals

import kotlinx.serialization.Serializable

@Serializable
data class Sys(
    val country: String?,
    val id: Int?,
    val message: Double? = 0.0,
    val sunrise: Int?,
    val sunset: Int?,
    val type: Int?
)