package com.example.daggerexample.di.components

import com.example.daggerexample.MainActivity
import com.example.daggerexample.di.modules.AppModule
import com.example.daggerexample.di.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, NetworkModule::class])
@Singleton
interface AppComponent {
   fun inject(mainActivity : MainActivity)
}