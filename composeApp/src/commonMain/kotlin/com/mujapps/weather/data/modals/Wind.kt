package com.mujapps.weather.data.modals

import kotlinx.serialization.Serializable

@Serializable
data class Wind(
    val deg: Int?,
    val speed: Double?
)