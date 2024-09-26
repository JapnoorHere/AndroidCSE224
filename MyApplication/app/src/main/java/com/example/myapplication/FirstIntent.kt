package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_intent)
        var et = findViewById<EditText>(R.id.et)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            var intent = Intent(this, SecondIntent::class.java)
            intent.putExtra("data",et.text.toString())
            startActivity(intent)
        }
    }
}