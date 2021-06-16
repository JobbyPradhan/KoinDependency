package com.example.koindependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koindependency.container.Component
import com.example.koindependency.databinding.ActivityMainBinding
import com.example.koindependency.modle.Car
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        component.car.getCar()
        component.main.getTea()
        component.main.getCoffee()

    }
}