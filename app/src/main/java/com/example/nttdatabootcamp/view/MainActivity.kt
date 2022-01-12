package com.example.nttdatabootcamp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import nttdatabootcamp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalendar = findViewById<Button>(R.id.nextToCalendar)
        btnCalendar.setOnClickListener {
            startActivity(Intent(this, Calendar::class.java))
        }

        val btnContact = findViewById<Button>(R.id.nextToContacts)
        btnContact.setOnClickListener {
            startActivity(Intent(this, Contacts::class.java))
        }

        val btnPhoto = findViewById<Button>(R.id.nextToPhoto)
        btnPhoto.setOnClickListener {
            startActivity(Intent(this, Photo::class.java))
        }
    }
}