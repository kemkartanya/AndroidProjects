package com.example.listadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.programmingList)
        val adapter = ProgrammingAdapter()

        val p1 = ProgrammingItem("Android13",	"13",	"API level 33")
        val p2 = ProgrammingItem("Android12L",	"12",	"API level 32")
        val p3 = ProgrammingItem("Android12",	"12",	"API level 31")
        val p4 = ProgrammingItem("Android11",	"11",	"API level 30")
        val p5 = ProgrammingItem("Android10",	"10",	"API level 29")
        val p6 = ProgrammingItem("Pie",	"9",	"API level 28")
        val p7 = ProgrammingItem("Oreo",	"8.1.0",	"API level 27")
        val p8 = ProgrammingItem("Oreo",	"8.0.0",	"API level 26")
        val p9 = ProgrammingItem("Nougat",	"7.1",	"API level 25")
        val p10 = ProgrammingItem("Nougat",	"7.0",	"API level 24")
        val p11 = ProgrammingItem("Marshmallow",	"6.0",	"API level 23")
        val p12 = ProgrammingItem("Lollipop",	"5.1",	"API level 22")
        val p13 = ProgrammingItem("Lollipop",	"5.0",	"API level 21")
        val p14 = ProgrammingItem("KitKat",	"4.4 - 4.4.4",	"API level 19")
        val p15 = ProgrammingItem("Jelly Bean",	"4.3.x",	"API level 18")
        val p16 = ProgrammingItem("Jelly Bean",	"4.2.x",	"API level 17")
        val p17 = ProgrammingItem("Jelly Bean",	"4.1.x",	"API level 16")
        val p18 = ProgrammingItem("Ice Cream Sandwich",	"4.0.3 - 4.0.4",	"API level 15, NDK 8")
        val p19 = ProgrammingItem("Ice Cream Sandwich",	"4.0.1 - 4.0.2",	"API level 14, NDK 7")
        val p20 = ProgrammingItem("Honeycomb",	"3.2.x",	"API level 13")
        val p21 = ProgrammingItem("Honeycomb",	"3.1",	"API level 12, NDK 6")
        val p22 = ProgrammingItem("Honeycomb",	"3.0",	"API level 11")
        val p23 = ProgrammingItem("Gingerbread",	"2.3.3 - 2.3.7",	"API level 10")
        val p24 = ProgrammingItem("Gingerbread",	"2.3 - 2.3.2",	"API level 9, NDK 5")
        val p25 = ProgrammingItem("Froyo",	"2.2.x",	"API level 8, NDK 4")
        val p26 = ProgrammingItem("Eclair",	"2.1",	"API level 7, NDK 3")
        val p27 = ProgrammingItem("Eclair",	"2.0.1",	"API level 6")
        val p28 = ProgrammingItem("Eclair",	"2.0",	"API level 5")
        val p29 = ProgrammingItem("Donut",	"1.6",	"API level 4, NDK 2")
        val p30 = ProgrammingItem("Cupcake",	"1.5",	"API level 3, NDK 1")
        val p31 = ProgrammingItem("(no codename)",	"1.1",	"API level 2")
        val p32 = ProgrammingItem("(no codename)",	"1.0",	"API level 1")
        adapter.submitList(listOf(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

    }
}