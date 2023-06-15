package com.example.learningfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    class ExampleFragment : Fragment(R.layout.example_fragment)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = ExampleFragment()
        val ft = this.supportFragmentManager.beginTransaction()
        ft.add(fragment, "fragment")
        ft.commit()

    }
}