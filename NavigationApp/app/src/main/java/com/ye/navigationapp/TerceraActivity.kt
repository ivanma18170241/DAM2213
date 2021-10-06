package com.ye.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ye.navigationapp.databinding.ActivityTerceraBinding

class TerceraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerceraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTerceraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNavegar2.setOnClickListener {
            var texto: String = binding.edText.text.toString()
            val intent = Intent()
            intent.putExtra("texto", texto)
            setResult(88, intent)
            finish()
        }

        binding.btnCancelar.setOnClickListener {
            val intent = Intent()
            intent.putExtra("cancelar", "Se cancelo en actividad tres")
            setResult(20, intent)
            finish()
        }
    }
}