package com.ye.lc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var mensaje ="Hola en cuanto se crea mi aplicación"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Ciclo de vida", "onCreate()")

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        val boton = findViewById<Button>(R.id.button)

        boton.setOnClickListener {
            mensaje = "Mensaje cuando doy click al boton - se modifica valor"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de vida", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de vida", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de vida", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de vida", "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo de vida", "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de vida", "onDestroy()")
    }
}