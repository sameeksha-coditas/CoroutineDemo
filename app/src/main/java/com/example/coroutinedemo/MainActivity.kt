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
           val networkCallAnswer=doNetworkCall()
            val networkCallAnswer2=doNetworkCall2()
           Logger.infoLog("Hello from Coroutine  ${Thread.currentThread().name}")
            Logger.infoLog(" $networkCallAnswer")
            Logger.infoLog(" $networkCallAnswer2")
        }
        Logger.infoLog("Hello from thread  ${Thread.currentThread().name}")
    }

    suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is the answer"
    }

    suspend fun doNetworkCall2():String{
        delay(3000L)
        return "This is the answer"
    }


}