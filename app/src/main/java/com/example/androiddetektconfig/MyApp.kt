package com.example.androiddetektconfig

import android.app.Application

/**
 * Just a general extension of the Application class but alot less boilerplate compared to
 * plain java. I use the class to setup contexts in an easy fashion
 * compared the static context hellwe have on the java side.
 */
class MyApp: Application() {

    /*
      Works by creating a private field to store the
      context in thus no static context hell like java
     */
    init {
        instance = this
    }

    companion object {
        private var instance: MyApp? = null

        fun applicationContext() : MyApp {
            return instance!!
        }
    }

    /*
       Not much to put here as we can now load cusot fonts in xml. One would
       still put any fany debug initialization one has to do here.
     */
    override fun onCreate() {
        super.onCreate()
    }
}