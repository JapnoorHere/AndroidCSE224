package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class ContextMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_context_menu)
        var img = findViewById<ImageView>(R.id.img)

        registerForContextMenu(img)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var img = findViewById<ImageView>(R.id.img)
        var main = findViewById<ConstraintLayout>(R.id.main)
        return when(item.itemId){
            R.id.changeColor ->{
                img.setColorFilter(Color.RED)
                Toast.makeText(this,"Color Changed", Toast.LENGTH_LONG).show()
                Snackbar.make(main,"Color Changed",Snackbar.LENGTH_LONG).setAction("Undo"){
                    img.setColorFilter(null)
                }.show()
                true
            }
            R.id.rotate ->{
                img.rotation += 180f
                Snackbar.make(main,"Image rotated",Snackbar.LENGTH_LONG).setAction("Undo"){
                    img.rotation -= 180f
                }.show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}