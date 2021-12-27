package com.example.nttdatabootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import nttdatabootcamp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVamosComecar = findViewById<Button>(R.id.vamosComecar)

        btnVamosComecar.setOnClickListener {
            startActivity(Intent(this, Calendar::class.java))
        }

    }
}