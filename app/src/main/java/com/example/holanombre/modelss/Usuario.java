package com.example.holanombre.modelss;

class Usuario {

    var nombre: String
    var apellido: String

    public Usuario(var nombre, var apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    fun getBundle():Bundle?{
        var bundle=Bundle()
        bundle.putString("nombre",this.nombre)
        bundle.putString("apellido",this.apellido)
    }
}
