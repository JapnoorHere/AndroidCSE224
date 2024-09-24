package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        var et = findViewById<EditText>(R.id.et)
        var btn = findViewById<Button>(R.id.btn)
        var lv = findViewById<ListView>(R.id.lv)
        var clearBtn = findViewById<Button>(R.id.clearBtn)
        var list = ArrayList<String>();

        var listAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)

        lv.adapter = listAdapter

        btn.setOnClickListener {
            if (et.text.toString().isEmpty()) {
                Toast.makeText(this@ListView,"Enter data",Toast.LENGTH_SHORT).show()
            } else {

                list.add(et.text.toString());
                listAdapter.notifyDataSetChanged()
                et.text.clear()

            }

        }

        clearBtn.setOnClickListener{
            list.clear()
            listAdapter.notifyDataSetChanged()
        }

        //Adapters act as bridge between xml and kotlin

    }
}