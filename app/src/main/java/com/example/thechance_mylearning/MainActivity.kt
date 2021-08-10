package com.example.thechance_mylearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val call: ImageButton = findViewById(R.id.callicon)
        val timeline: TextView = findViewById(R.id.timelineText)

        timeline.setOnClickListener(){
            Toast.makeText(applicationContext,"text view is clickkkkable",Toast.LENGTH_SHORT).show()
        }
    }
    fun click (v:View){
        Toast.makeText(applicationContext,"image button is clickkkkable",Toast.LENGTH_SHORT).show()
    }
}