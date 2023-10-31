package com.example.holanombre.actividades

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.holanombre.R

class segundaActividad : AppCompatActivity() {

    lateinit var textView2: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_actividad)
        textView2=findViewById<TextView>(R.id.tvSecond)

        var resultado= intent.getStringExtra("resultado")

        textView2.text=resultado

    }

}