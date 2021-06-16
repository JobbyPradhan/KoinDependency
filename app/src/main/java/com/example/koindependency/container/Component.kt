package com.example.koindependency.container

import com.example.koindependency.modle.Car
import com.example.koindependency.modle.Engine
import com.example.koindependency.modle.Main
import com.example.koindependency.modle.Wheel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@KoinApiExtension
class Component : KoinComponent {

    val car : Car by inject()
    val engine : Engine by inject()
    val wheel : Wheel by inject()
    val main : Main by inject()
}