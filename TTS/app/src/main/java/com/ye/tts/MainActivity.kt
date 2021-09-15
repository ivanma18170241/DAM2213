package com.ye.tts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var textToSpeech: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textToSpeech = TextToSpeech(this, this)
        
        findViewById<Button>(R.id.btn_play).setOnClickListener{ hablar()}

    }

    fun hablar() {
        var mensaje : String = findViewById<TextView>(R.id.txt_hello).text.toString()
        textToSpeech?.speak(mensaje, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onInit(status: Int) {
        var mensaje : TextView = findViewById<TextView>(R.id.txt_hello)
        if(status == TextToSpeech.SUCCESS) {
            mensaje.text = "Hola, si se pudo c:"
            textToSpeech?.setLanguage(Locale.GERMANY)
        } else {
            mensaje.text = "No se puso :c"
        }
    }
}