package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        var name = findViewById<EditText>(R.id.name)
        var gender = findViewById<EditText>(R.id.gender)
        var btn = findViewById<Button>(R.id.btn)


        btn.setOnClickListener {
            Log.d("SignupActivity", "Going to Welcome Activity")
            var intent = Intent(this,WelcomeActivity::class.java)
            intent.putExtra("name",name.text.toString())
            intent.putExtra("gender",gender.text.toString())
            startActivity(intent)
        }

    }
}