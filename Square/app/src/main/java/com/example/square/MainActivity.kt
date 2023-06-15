package com.example.square

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.editTextNumber)
        val show = findViewById<Button>(R.id.button)
        val square = findViewById<TextView>(R.id.textView2)

        show.setOnClickListener() {
            val inputValue = input.text.toString().toInt()
            val sq = inputValue * inputValue
            square.setText("Square of number " + inputValue + " is " + sq)
        }

    }
}