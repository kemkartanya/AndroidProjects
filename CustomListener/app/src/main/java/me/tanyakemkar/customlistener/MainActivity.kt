package me.tanyakemkar.customlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView1 : TextView
    lateinit var textView2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)

        var demo = Demo(textView1, textView2)
    }

}

class Demo(var textView1: TextView, var textView2: TextView) : VideoPlayerListener{
    init {
        val videoPlayer = VideoPlayer(textView2)
        videoPlayer.addListener(this)
        videoPlayer.release()
    }

    override fun onResourcesReleased() {
        textView1.text = "Namaste to Coding Art, where passion meets hard work, wonders happen."
        println("Resources are finally released")
    }
}

