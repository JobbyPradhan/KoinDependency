package com.example.koindependency.module

import com.example.koindependency.modle.CoffeeInterfaces
import com.example.koindependency.modle.Main
import com.example.koindependency.modle.MyInterfaces
import com.example.koindependency.modle.MyInterfacesImpl
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val teaModule = module {

    //factory { MyInterfacesImpl() as MyInterfaces }
    //factory<MyInterfaces>{ MyInterfacesImpl() }
 //   factory { MyInterfacesImpl() } bind MyInterfaces::class
    factory { MyInterfacesImpl() } binds arrayOf(MyInterfaces::class,CoffeeInterfaces::class)
    factory { Main(get(),get()) }
}