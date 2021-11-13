package com.example.daggerexample.services.implement

import android.content.Context
import com.example.daggerexample.services.NetworkService

class NetworkServiceImplement (private val context: Context) : NetworkService {

    override fun getHello(): String {
        return context::class.simpleName.toString()
    }
}