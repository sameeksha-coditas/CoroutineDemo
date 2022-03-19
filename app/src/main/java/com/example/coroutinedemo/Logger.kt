package com.example.coroutinedemo

import android.util.Log

object Logger {
    private const val tag="MainActivity"

    fun infoLog(msg:String)
    {
        Log.i(tag,msg)
    }
}