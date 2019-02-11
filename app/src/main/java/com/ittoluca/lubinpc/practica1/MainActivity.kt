package com.ittoluca.lubinpc.practica1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bacep = findViewById<Button>(R.id.baceptar)
        val bcancel=findViewById<Button>(R.id.bcancelar)
        bacep.setOnClickListener{
            val intent= Intent(this,perfil::class.java)
            startActivity(intent)
        }

    }
}


