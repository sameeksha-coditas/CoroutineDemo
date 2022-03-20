package com.example.coroutinedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text=findViewById<TextView>(R.id.tvAnswer)

        GlobalScope.launch(Dispatchers.IO){
            Logger.infoLog("Starting coroutine in thread ${Thread.currentThread().name}")
            val answer=doNetworkCall()
            withContext(Dispatchers.Main)
            {
                Logger.infoLog("Setting text in thread ${Thread.currentThread().name}")
             text.text=answer;
            }
        }
        Logger.infoLog("Hello from thread  ${Thread.currentThread().name}")
    }

    private suspend fun doNetworkCall():String{
        delay(3000L)
        return "This is the answer"
    }

    private suspend fun doNetworkCall2():String{
        delay(3000L)
        return "This is the answer"
    }


}