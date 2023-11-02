package com.example.holanombre.otraCarpeta

import android.os.Bundle

class Usuario{
    
    var nombre: String
        get() {
            return nombre
        }
    
        set(value) {
            nombre=value
        }
    var apellido: String
        get() {
            return apellido
        }

        set(value) {
            apellido=value
        }
       
           
        constructor(nombre: String, apellido: String) {
            this.nombre = nombre
            this.apellido = apellido
        }

        constructor(bundle: Bundle) {
            this.nombre = bundle.getString("nombre")!!
            this.apellido = bundle.getString("apellido")!!
        }
    
    fun getBundle(): Bundle? {
        var bundle = Bundle()

        bundle.putString("nombre", this.nombre)
        bundle.putString("apellido", this.apellido)
        return bundle
    }
}


