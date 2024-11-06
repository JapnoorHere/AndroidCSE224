package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating)
        var ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        var submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            val msg = ratingBar.rating.toString()
            Toast.makeText(this,
                "Rating is: "+msg, Toast.LENGTH_SHORT).show()
        }


    }
}