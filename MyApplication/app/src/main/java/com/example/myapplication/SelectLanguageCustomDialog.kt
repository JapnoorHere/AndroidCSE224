package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SelectLanguageCustomDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_select_language_custom_dialog)
        var btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            var dialogView = LayoutInflater.from(this).inflate(R.layout.select_language_dialog_layout, null)
            var dialog = AlertDialog.Builder(this).setView(dialogView)
            dialog.setCancelable(false)
            var listView = dialogView.findViewById<ListView>(R.id.listView)
            var list = listOf("English","Spanish","Hindi","Punjabi","French","Italian")
            var listAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)

            listView.adapter = listAdapter

            listView.setOnItemClickListener { _, _, position, _ ->
                when (position) {
                    0 -> {
                        Toast.makeText(
                            this@SelectLanguageCustomDialog,
                            "English is selected",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    1 -> {
                        Toast.makeText(
                            this@SelectLanguageCustomDialog,
                            "Spanish is selected",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    2 -> {
                        Toast.makeText(
                            this@SelectLanguageCustomDialog,
                            "Hindi is selected",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    3 -> {
                        Toast.makeText(
                            this@SelectLanguageCustomDialog,
                            "Punjabi is selected",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    4 -> {
                        Toast.makeText(
                            this@SelectLanguageCustomDialog,
                            "French is selected",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    5 -> {
                        Toast.makeText(
                            this@SelectLanguageCustomDialog,
                            "Italian is selected",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }

            dialog.create().show()
        }
    }
}