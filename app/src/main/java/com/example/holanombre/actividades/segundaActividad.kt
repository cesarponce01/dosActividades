package com.example.holanombre.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.holanombre.R
import com.example.holanombre.otraCarpeta.Usuario

lateinit var textView2: TextView
class segundaActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_actividad)

        textView2=findViewById(R.id.tvSecond)
        var nombre= intent.getStringExtra("nombre")
        var apellido=intent.getStringExtra("apellido")

        var bundleUsuario=intent.getBundleExtra("claseUsuario")
        var usuario= Usuario(bundleUsuario!!)

        textView2.text=usuario.nombre+" "+usuario.apellido
    }
}