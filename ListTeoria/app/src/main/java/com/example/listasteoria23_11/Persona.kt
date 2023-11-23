package com.example.listasteoria23_11

class Persona {
    var nombre:String
    var edad:Int

    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    fun clone(persona: Persona):Persona{
        return Persona(persona.nombre,persona.edad)
    }
}