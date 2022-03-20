package com.example.coroutinedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.infoLog("Before runBlocking")

        runBlocking {
            Logger.infoLog("Start of runBlocking")
            launch(Dispatchers.IO){
                delay(3000L)
                Logger.infoLog("Finished IO Coroutine 1")
            }
            launch(Dispatchers.IO){
                delay(3000L)
                Logger.infoLog("Finished IO Coroutine 2")
            }
            Logger.infoLog("End of runBlocking")
        }

        Logger.infoLog("After runBlocking")

    }

}