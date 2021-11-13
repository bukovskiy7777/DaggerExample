package com.example.daggerexample.di.modules

import android.content.Context
import com.example.daggerexample.services.NetworkService
import com.example.daggerexample.services.implement.NetworkServiceImplement
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [AppModule::class])
class NetworkModule {

    @Provides
    @Singleton
   fun provideNetworkService(context : Context) : NetworkService {
       return NetworkServiceImplement(context)
   }
}