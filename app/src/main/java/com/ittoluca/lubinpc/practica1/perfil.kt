package com.ittoluca.lubinpc.practica1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
        val bsig=findViewById<Button>(R.id.bSig)
        val blimp=findViewById<Button>(R.id.bLimpiar)
        var nombre= findViewById<EditText>(R.id.ETNombre)
        var edad= findViewById<EditText>(R.id.ETEdad)
        var correo= findViewById<EditText>(R.id.ETCorreo)
        var fecha= findViewById<EditText>(R.id.ETFecha)

        bsig.setOnClickListener {
            if(nombre.text.isEmpty()||edad.text.isEmpty()||correo.text.isEmpty()||fecha.text.isEmpty()){
                Toast.makeText(this,"llena todos los campos",Toast.LENGTH_LONG).show()
            }else {
                val intent = Intent(this, informacion::class.java)
                val nom=nombre.text
                intent.putExtra("NOMBRE",nombre.text.toString())
                intent.putExtra("edad",edad.text.toString())
                intent.putExtra("correo",correo.text.toString())
               intent.putExtra("fecha",fecha.text.toString())

                startActivity(intent)
            }
        }
        blimp.setOnClickListener {
            nombre.setText("")
            edad.setText("")
            correo.setText("")
            fecha.setText("")

        }
    }
}


