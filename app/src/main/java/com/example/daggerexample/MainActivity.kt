package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.daggerexample.services.NetworkService
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.appComponent.inject(this)

        val textView : TextView = findViewById(R.id.text_view)
        textView.text = networkService.getHello()
    }
}