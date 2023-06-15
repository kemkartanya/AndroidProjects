package me.tanyakemkar.gradientdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val z = findViewById<ImageView>(R.id.imageView)

        z.setOnClickListener {
            intent = Intent(applicationContext, SignUp::class.java)
            startActivity(intent)
        }
    }
}