package com.example.koindependency.modle

import android.util.Log

class Car constructor(private val engine: Engine, private val wheel: Wheel){
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("TAGGGO", "car is driving")
    }
}


class Engine {
    fun getEngine(){
        Log.d("TAGGGO", "getEngine: ")
    }
}

class Wheel{
    fun getWheel(){
        Log.d("TAGGGO", "getWheel: ")
    }
}