package com.example.iteradmin.list_view2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list=findViewById<ListView>(R.id.list)

        val dddata= arrayOf("laptop","chair","table","pen","fan","ac","guitar","drums","amplifier","toy","videogames","cricket","football","badminton","car","bike")
        val adp=ArrayAdapter<String>(this,R.layout.data,dddata)
        list.adapter=adp

        list.setOnItemClickListener{parent,view,position,id ->
            Toast.makeText(this,"position of ${position}",Toast.LENGTH_LONG).show()
        }
    }
}
