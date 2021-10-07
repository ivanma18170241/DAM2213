package com.ye.lc

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var mensaje ="Hola en cuanto se crea mi aplicación"

    private var mediaPlayer: MediaPlayer? = null

    private var position: Int = 0

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
        mediaPlayer = MediaPlayer.create(this, R.raw.musica)

    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de vida", "onResume()")

        mediaPlayer?.seekTo(position)
        mediaPlayer?.start()
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de vida", "onPause()")
        mediaPlayer?.pause()

        if(mediaPlayer != null) {
            position = mediaPlayer!!.currentPosition
        }
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de vida", "onStop()")
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
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