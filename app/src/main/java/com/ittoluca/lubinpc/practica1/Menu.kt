package com.ittoluca.lubinpc.practica1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val bimg=findViewById<Button>(R.id.BImagenes);
        bimg.setOnClickListener {
            val intent= Intent(this,Imagenes::class.java)
            startActivity(intent)
        }
    }
}
