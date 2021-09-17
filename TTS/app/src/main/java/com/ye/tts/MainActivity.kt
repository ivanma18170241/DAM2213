package com.ye.tts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var textToSpeech: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textToSpeech = TextToSpeech(this, this)

        findViewById<Button>(R.id.btn_play).setOnClickListener {
           hablar()
        }

    }

    fun hablar() {
        var mensaje : String = findViewById<EditText>(R.id.ed_mensaje).text.toString()

        if(mensaje.isEmpty()) {
            Toast.makeText(this, "Por favor, ingrese un mensaje", Toast.LENGTH_SHORT).show()
        }

        textToSpeech?.speak(mensaje, TextToSpeech.QUEUE_FLUSH, null, "")
    }


    override fun onInit(status: Int) {
        var mensaje : TextView = findViewById<TextView>(R.id.txt_hello)
        if(status == TextToSpeech.SUCCESS) {
            mensaje.text = "Hola, si se pudo c:"
            textToSpeech?.language = Locale("ES")
        } else {
            mensaje.text = "No se pudo :c"
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if(textToSpeech != null) {
            textToSpeech?.stop()
            textToSpeech?.shutdown()
        }
    }
}