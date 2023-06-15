package me.tanyakemkar.appdevassignment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val callBtn = findViewById<Button>(R.id.button2)
        callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "999999XXXX"))
            startActivity(intent)
        }

        val img = findViewById<ImageView>(R.id.saumya)
        val img1 = findViewById<ImageView>(R.id.keerti)
        val img2 = findViewById<ImageView>(R.id.khushboo)

        img.setOnClickListener {
            intent = Intent(applicationContext, saumya::class.java)
            startActivity(intent)
        }
        img1.setOnClickListener {
            intent = Intent(applicationContext, keerti::class.java)
            startActivity(intent)
        }
        img2.setOnClickListener {
            intent = Intent(applicationContext, khushboo::class.java)
            startActivity(intent)
        }
    }
}