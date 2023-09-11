package com.example.udemy_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.udemy_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            displayGreeting()
        }

    }

    private fun displayGreeting() {
        binding.tvName.text = "Hello ${binding.etName.text}"
    }


}