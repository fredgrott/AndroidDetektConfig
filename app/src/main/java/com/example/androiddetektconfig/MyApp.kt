/* Copyright 2018 Fred Grott

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
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
