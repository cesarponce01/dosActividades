package com.example.holanombre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.holanombre.actividades.segundaActividad
import com.example.holanombre.otraCarpeta.Usuario

class MainActivity : AppCompatActivity() {

     lateinit var editTextNombre:EditText
     lateinit var etApellido:EditText

     lateinit var nombre:String
     lateinit var apellido:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //textViewEtiqueta=findViewById(R.id.textView)
        editTextNombre=findViewById(R.id.etNombre)
        etApellido=findViewById(R.id.etApellido)
    }

    fun onAltaUsuario(view: View){
        nombre=editTextNombre.text.toString()
        apellido=etApellido.text.toString()


       var usuario= Usuario(nombre,apellido)
                                                        // Se direcciona la segunda actividad
        var mi_intent2=Intent(this,segundaActividad::class.java)


        mi_intent2.putExtra("claseUsuario",usuario.getBundle())

        startActivity(mi_intent2)
        }

}


