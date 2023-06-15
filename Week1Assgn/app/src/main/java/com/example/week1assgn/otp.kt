package com.example.week1assgn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class otp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val tV = findViewById<TextView>(R.id.textView5)
            tV.text = "OTP Sent Successfully"
            tV.visibility = View.VISIBLE
        }

        val rec_phone = findViewById<TextView>(R.id.textView3)
        rec_phone.text = "Verify OTP sent to " + intent.getStringExtra("hey")
    }
}