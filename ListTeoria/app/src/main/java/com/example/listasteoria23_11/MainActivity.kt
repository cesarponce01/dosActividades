package com.example.listasteoria23_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)

        var valor=numbers[0]

        var mutableNumbers:MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)


        mutableNumbers[1]=10
        mutableNumbers.add(30)

        var valorMutable=mutableNumbers[3]
        var persona1=Persona("Pepe",30)
        var persona2=Persona("Maria",25)

        var mutablePersona:MutableList<Persona> = mutableListOf(persona1,persona2)


        persona2.edad=45

        var esta=mutablePersona.contains(persona2)

        var personaOtraMaria=Persona("Maria",25)

        esta=mutablePersona.contains(personaOtraMaria)


        //Cómo nos movemos en una lista

        var i=0
        while (i <mutablePersona.size){
            var persona=mutablePersona[i].clone(mutablePersona[i])
            println(mutablePersona[i])
            i++
        }

        for(nombre in mutablePersona){
            println("Nombre: $nombre")
        }

        //Creamos un ArrayList
        var nuevaListaPersona:ArrayList<Persona> = ArrayList()
        for(persona in mutablePersona){
            nuevaListaPersona.add(persona)
        }

        nuevaListaPersona.get(1).nombre="César"
        var otraListaPersona:ArrayList<Persona> = ArrayList(mutablePersona)


    }
}