package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class AppLocal2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_local2)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener {
            setLocale("en")
        }

        btn2.setOnClickListener {
            setLocale("pa")
        }

    }

    private fun setLocale(s: String) {
        var curr = resources.configuration.locales.get(0).language
        if(curr != s){
            var locale = Locale(s)
            Locale.setDefault(locale)
            var config = Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config,resources.displayMetrics)
        }
        recreate()
    }
}