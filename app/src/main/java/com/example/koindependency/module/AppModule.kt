package com.example.koindependency.module

import com.example.koindependency.modle.Car
import com.example.koindependency.modle.Engine
import com.example.koindependency.modle.Wheel
import org.koin.dsl.module

val appModule = module {
    factory { Wheel() }
    factory { Engine() }
    factory {
        Car(get(),get())
    }
}