package com.mujapps.weather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform