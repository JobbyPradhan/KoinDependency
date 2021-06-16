package com.example.koindependency.modle

import android.util.Log

interface MyInterfaces {
    fun getTea()
}
interface CoffeeInterfaces{
    fun getCoffee()
}

class MyInterfacesImpl : MyInterfaces,CoffeeInterfaces{
    override fun getTea() {
        Log.d("TAGGGO", "One cup Tea Plz")
    }

    override fun getCoffee() {
        Log.d("TAGGGO", "One cup Coffee Plz")
    }

}

class Main (private val tea : MyInterfaces,private val coffee:CoffeeInterfaces){
    fun getTea(){
        tea.getTea()
    }
    fun getCoffee(){
        coffee.getCoffee()
    }
}