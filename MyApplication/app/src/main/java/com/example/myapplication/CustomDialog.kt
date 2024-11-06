package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_dialog)
        var btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            var dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog_layout, null)
            var dialog = AlertDialog.Builder(this).setView(dialogView)
            dialog.setCancelable(false)
            dialog.setPositiveButton("Subscribe") { dialog, _ ->
                var email = dialogView.findViewById<EditText>(R.id.email)
                if(email.text.toString().isEmpty()){
                    Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, email.text.toString() + " is Subscribed", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }

            }
            dialog.setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            dialog.create().show()
        }
    }
}