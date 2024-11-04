package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        var name = intent.getStringExtra("name")
        var gender = intent.getStringExtra("gender")

        var text1 = findViewById<TextView>(R.id.name)
        var text2 = findViewById<TextView>(R.id.gender)

        Toast.makeText(this,"Data received name: ${name} and gender: ${gender}",Toast.LENGTH_LONG).show()

        text1.text = name
        text2.text = gender

    }
}