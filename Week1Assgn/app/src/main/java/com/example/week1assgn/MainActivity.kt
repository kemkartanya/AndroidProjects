package com.example.week1assgn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener {
            val phone = findViewById<EditText>(R.id.editTextPhone).text.toString()
            val intent = Intent(applicationContext, otp::class.java)
            intent.putExtra("hey", phone)
            startActivity(intent)
        }
    }
}