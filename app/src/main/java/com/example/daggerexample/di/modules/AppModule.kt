package com.example.daggerexample.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (private val context: Context) {

    @Provides
    @Singleton
    fun provideContext() : Context {
        return this.context
    }

}