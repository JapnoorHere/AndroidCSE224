package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class EmailIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_email_intent)

        val subject = findViewById<EditText>(R.id.subject)
        val body = findViewById<EditText>(R.id.body)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/html")
            intent.putExtra(Intent.EXTRA_EMAIL, "sjapnoor11@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, subject.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, body.text.toString())
            startActivity(Intent.createChooser(intent, "Send Email"))
        }

    }
}