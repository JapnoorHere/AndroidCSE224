package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertDialogFirst : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_dialog_first)
        var exit = findViewById<Button>(R.id.exit)

        exit.setOnClickListener {
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("Exit")
            dialog.setMessage("Are you sure you want to exit?")
            dialog.setCancelable(false)
            dialog.setPositiveButton("Yes") { dialog, _ ->
                finish()
            }
            dialog.setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }

            dialog.setNeutralButton("Maybe"){dialog,_ ->
                Toast.makeText(this, "Press Yes or No button", Toast.LENGTH_SHORT).show()
            }

            dialog.show()
        }
    }
}