package com.mujapps.weather

import android.app.Application
import com.mujapps.weather.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WeatherApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val requiredModules = sharedKoinModules //Adding modules for the dependency graph

        startKoin {
            androidContext(this@WeatherApp)
            modules(requiredModules)
        }
    }
}