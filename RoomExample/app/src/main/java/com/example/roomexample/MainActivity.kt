package com.example.roomexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var dataBase: ContactDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBase = ContactDataBase.getDatabase(this)
        val database2 = ContactDataBase.getDatabase(this)

        GlobalScope.launch {
            dataBase.contactDao().insertContact(Contact(0, "John", "99999", Date(), 1))
        }

    }

    fun getData(view: View) {
        dataBase.contactDao().getContact().observe(this) {
            Log.d("CheezyCode", it.toString())
        }
    }
}