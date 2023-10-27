package com.example.holanombre

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.holanombre.actividades.segundaActividad

class MainActivity : AppCompatActivity() {

     //lateinit var  textViewEtiqueta:TextView
     lateinit var editTextNombre:EditText

     lateinit var nombre:String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textViewEtiqueta=findViewById(R.id.textView)
        editTextNombre=findViewById(R.id.editTextNombre)


    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }


    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    fun onCambiarTexto(view: View){
       nombre=editTextNombre.text.toString()
        //textViewEtiqueta.text="Hola"+nombre
        /*
        var mi_intent=Intent(this,secondActivity::class.java)
        startActivity(mi_intent)

        */
                                                        // Se direcciona la segunda actividad
        var mi_intent2:Intent=Intent(this,segundaActividad::class.java)

        mi_intent2.putExtra("resultado",nombre)

        startActivity(mi_intent2)
    }
}