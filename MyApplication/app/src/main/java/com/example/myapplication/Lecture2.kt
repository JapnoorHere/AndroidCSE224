package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lecture2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture2)

        var editText1 = findViewById<EditText>(R.id.editText1)
        var editText2 = findViewById<EditText>(R.id.editText2)
        var button = findViewById<Button>(R.id.button)
        var textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            var name = editText1.text.toString();
            var phone = editText2.text.toString();

            textView.text = "My name is " + name + " and phone number is " + phone;

        }

    }
}