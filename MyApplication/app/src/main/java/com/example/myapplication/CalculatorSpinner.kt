package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculatorSpinner : AppCompatActivity() {

    fun add(first: Int, second: Int): Int{
        return first+second
    }

    fun subtract(first: Int, second: Int): Int{
        return first-second
    }
    fun multiply(first: Int, second: Int): Int{
        return first*second
    }
    fun divide(first: Int, second: Int): Int{
        return first/second
    }

    fun modulus(first: Int, second: Int): Int{
        return first%second
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator_spinner)

        var et1 = findViewById<EditText>(R.id.et1)
        var et2 = findViewById<EditText>(R.id.et2)
        var spinner = findViewById<Spinner>(R.id.spinner);
        var tv = findViewById<TextView>(R.id.tv)
        var btn = findViewById<Button>(R.id.btn)
        var operationToPerform: String = "+"

        var spinnerArray =
            arrayOf("Addition +", "Subtraction -", "Multiplication *", "Division /", "Modulus %");

        var spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArray)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                when (position) {
                    0 -> operationToPerform = "+"
                    1 -> operationToPerform = "-"
                    2 -> operationToPerform = "*"
                    3 -> operationToPerform = "/"
                    4 -> operationToPerform = "%"
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        btn.setOnClickListener {
            if (et1.text.toString().isEmpty() && et2.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            } else {
                var first = et1.text.toString().toInt()
                var second = et2.text.toString().toInt()
                var res = 0;
                when (operationToPerform) {
                    "+" ->{
                        res = add(first,second)
                    }
                    "-" ->{
                        res = subtract(first,second)
                    }
                    "*" ->{
                        res = multiply(first,second)
                    }
                    "/" ->{
                        res = divide(first,second)
                    }
                    "%" ->{
                        res = modulus(first,second)
                    }

                }
                tv.text = "Result: $res";
            }
        }

    }
}