package com.example.serviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.button)
        val btnStop = findViewById<Button>(R.id.button2)

        btnStart.setOnClickListener {
            startService(Intent(applicationContext, MusicService::class.java))
        }

        btnStop.setOnClickListener {
            stopService(Intent(applicationContext, MusicService::class.java))
        }
    }
}