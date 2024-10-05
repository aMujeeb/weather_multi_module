package com.mujapps.weather.data.modals

import kotlinx.serialization.Serializable

@Serializable
data class Clouds(
    val all: Int?
)