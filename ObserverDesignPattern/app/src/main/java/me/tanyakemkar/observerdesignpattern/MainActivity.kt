package me.tanyakemkar.observerdesignpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    private lateinit var text: TextView
    private lateinit var text1: TextView
    private lateinit var text2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.myButton)
        text = findViewById<TextView>(R.id.myTextView)
        text1 = findViewById<TextView>(R.id.myTextView1)
        text2 = findViewById<TextView>(R.id.myTextView2)


        // By lambda
        button.setOnClickListener {
            text.text = "Clicked"
            text1.text = "Clicked"
            text2.text = "Clicked"
        }
    }
}
