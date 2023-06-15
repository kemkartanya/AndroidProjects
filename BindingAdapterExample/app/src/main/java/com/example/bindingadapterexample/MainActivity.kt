package com.example.bindingadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingadapterexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val post = Post("Introduction to Kotlin", "Namaste Kotlin", "https://lh3.googleusercontent.com/-p-lwdGoPXwU/X-8v30gUBII/AAAAAAAABQk/tPEKSb-42o0d10RwrQruyP98uOw7TdiGQCLcBGAsYHQ/kotlin-introduction-cheezycode.png")
        binding.post = post
    }
}