package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioButtonAndCheckButtons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button_and_check_buttons)

        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        var checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        var checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        var checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        var textView3 = findViewById<TextView>(R.id.textView3)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            var sizeId = radioGroup.checkedRadioButtonId
            var size = when(sizeId){

                R.id.radioButton1 -> "large"

                R.id.radioButton2 -> "medium"

                R.id.radioButton3 -> "small"

                else -> "medium"
            }
            var toppings = ArrayList<String>()
            if(checkBox1.isChecked){
                toppings.add(checkBox1?.text.toString())
            }
            if(checkBox2.isChecked){
                toppings.add(checkBox2?.text.toString())
            }
            if(checkBox3.isChecked){
                toppings.add(checkBox3?.text.toString())
            }

            textView3.text = "You selected $size size pizza with ${toppings.joinToString(", ")} toppings"

        }

    }
}