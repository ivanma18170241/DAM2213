package com.ye.navigationapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ye.navigationapp.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaBinding
    private var detalle: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras?.let {
            detalle = it.getString("detalle")
        }

        binding.txtTitle2.text = detalle

        binding.btnRegresar.setOnClickListener {

           val intent = Intent()
            intent.putExtra("mensaje", "Regresando dato de segunda actividad")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }
}