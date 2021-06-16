package com.example.koindependency.container

import android.app.Application
import com.example.koindependency.module.appModule
import com.example.koindependency.module.teaModule
import org.koin.core.context.startKoin

class BaseApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule, teaModule)
        }
    }
}