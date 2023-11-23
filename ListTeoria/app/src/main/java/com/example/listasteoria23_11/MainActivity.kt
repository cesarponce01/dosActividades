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
    }
}