package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.di.components.DaggerAppComponent
import com.example.daggerexample.di.modules.AppModule

class App : Application() {

    companion object {
        lateinit var appComponent : DaggerAppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build() as DaggerAppComponent
    }
}