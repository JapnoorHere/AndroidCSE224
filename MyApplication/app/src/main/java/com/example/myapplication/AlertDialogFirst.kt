package com.example.myapplication

import android.content.Intent
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
        var rating = findViewById<Button>(R.id.rating)
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

            dialog.setNeutralButton("Maybe") { dialog, _ ->
                Toast.makeText(this, "Press Yes or No button", Toast.LENGTH_SHORT).show()
            }


            dialog.show()
        }

        rating.setOnClickListener {
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("Give Rating")
            dialog.setMessage("Would you like to give us rating?")
            dialog.setCancelable(false)
            dialog.setPositiveButton("Yes") { dialog, _ ->
                var intent = Intent(this, RatingActivity::class.java)
                startActivity(intent)
            }
            dialog.setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }

            dialog.setNeutralButton("Remind me later") { dialog, _ ->
                Toast.makeText(this, "You will be notified later", Toast.LENGTH_SHORT).show()
            }
            dialog.show()
        }
    }
}