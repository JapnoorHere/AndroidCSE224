package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class SnackBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_snack_bar)

        var show = findViewById<Button>(R.id.show)

        show.setOnClickListener { view->
            Snackbar.make(view,"Photo deleted",Snackbar.LENGTH_INDEFINITE)
                .setAction("Undo"){
                    Snackbar.make(view,"Photo restored",10000)
                        .setAction("Dismiss"){

                        }.show()

                }.show()
        }
    }
}