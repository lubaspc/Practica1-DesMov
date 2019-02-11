package com.ittoluca.lubinpc.practica1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class informacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val Nombre=findViewById<TextView>(R.id.Tunombre)
        Nombre.setText(intent.getStringExtra("NOMBRE"))
        val Edad=findViewById<TextView>(R.id.TuEdad)
        Edad.setText("Tienes "+intent.getStringExtra("edad")+" años")
        val Correo=findViewById<TextView>(R.id.TuCorreo)
        Correo.setText("Tu correo electronico es: "+intent.getStringExtra("correo"))
        val Fecha=findViewById<TextView>(R.id.TuFecha)
        Fecha.setText("Hoy es "+intent.getStringExtra("fecha"))
        val bsig=findViewById<Button>(R.id.bsig2)
        bsig.setOnClickListener {
            val intent= Intent(this,Menu::class.java)
            startActivity(intent)
        }
    }
}
