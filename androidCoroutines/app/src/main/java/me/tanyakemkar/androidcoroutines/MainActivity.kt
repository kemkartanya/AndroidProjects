package me.tanyakemkar.androidcoroutines

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }

        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }
    }

    suspend fun task1() {
        Log.d(TAG, "STARTING TASK 1")
        yield()
        Log.d(TAG, "ENDING TASK 1")
    }

    suspend fun task2() {
        Log.d(TAG, "STARTING TASK 2")
        yield()
        Log.d(TAG, "ENDING TASK 2")
    }
}