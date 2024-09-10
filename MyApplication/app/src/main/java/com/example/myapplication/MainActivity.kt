package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast.makeText(this,"create",Toast.LENGTH_SHORT)
        toast.show()

        println("on create")


        var upload = findViewById<Button>(R.id.upload);
        var download = findViewById<Button>(R.id.download);

        upload.setOnClickListener {
            Toast.makeText(this,"uploading",Toast.LENGTH_SHORT).show();
        }


        download.setOnClickListener {
            Toast.makeText(this,"downloading",Toast.LENGTH_SHORT).show();
        }






    }

//    override fun onStart() {
//        super.onStart()
//
//        val toast = Toast.makeText(this,"start",Toast.LENGTH_SHORT)
//        toast.show()
//
//    }
//
//    override fun onResume() {
//        super.onResume()
//
//        val toast = Toast.makeText(this,"resume",Toast.LENGTH_SHORT)
//        toast.show()
//
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//
//        val toast = Toast.makeText(this,"restart",Toast.LENGTH_SHORT)
//        toast.show()
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//
//        val toast = Toast.makeText(this,"destroy",Toast.LENGTH_SHORT)
//        toast.show()
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//
//        val toast = Toast.makeText(this,"pause",Toast.LENGTH_SHORT)
//        toast.show()
//
//    }
//
//    override fun onStop() {
//        super.onStop()
//
//        val toast = Toast.makeText(this,"stop",Toast.LENGTH_SHORT)
//        toast.show()
//
//    }


}