package com.example.coroutinedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch{
            delay(3000L)
           Logger.infoLog("Hello from Coroutine  ${Thread.currentThread().name}")
        }
        Logger.infoLog("Hello from thread  ${Thread.currentThread().name}")
    }
}