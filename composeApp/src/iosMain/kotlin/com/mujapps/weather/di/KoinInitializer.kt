package com.mujapps.weather.di

import org.koin.core.context.startKoin

fun initKoin() { //Initializing Koin in IOS environment

    val iosModules = sharedKoinModules
    startKoin {
        modules(iosModules)
    }
}