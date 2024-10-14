package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)

        var url = findViewById<Button>(R.id.url)
        var nav = findViewById<Button>(R.id.nav)
        var cam = findViewById<Button>(R.id.cam)
        var cal = findViewById<Button>(R.id.cal)
        var contacts = findViewById<Button>(R.id.contacts)
        var gallery = findViewById<Button>(R.id.gallery)
        var dialer = findViewById<Button>(R.id.dialer)

        url.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i)
        }


        cam.setOnClickListener {
            val i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i)
        }

        cal.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i)
        }

        contacts.setOnClickListener {
            val i = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i)
        }

        gallery.setOnClickListener {
            val i = Intent()
            i.setType("image/*")
            i.setAction(Intent.ACTION_GET_CONTENT)
            startActivity(i)
        }

        dialer.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.setData(Uri.parse("tel:+919060798828"))
            startActivity(i)
        }

    }
}