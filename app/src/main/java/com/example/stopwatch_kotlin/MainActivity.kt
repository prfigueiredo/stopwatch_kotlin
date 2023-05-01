package com.example.stopwatch_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import com.example.stopwatch_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var running = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(binding.getRoot())

        binding.iniciar.setOnClickListener {
            IniciarCronometro()
        }
    }
    private fun IniciarCronometro(){
        if(!running){
            binding.cronometro.base = SystemClock.elapsedRealtime()
            binding.cronometro.start()
            running = true
        }
    }
}