package com.ye.navigationapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.ye.navigationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNavegar1.setOnClickListener {
            navegarActividadDos()
        }
    }

    private fun navegarActividadDos() {
       val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra("detalle", "Hola, detalle segunda actividad")
        // startActivity(intent)

        getResult.launch(intent)
    }

    private val getResult =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            if(it.resultCode == Activity.RESULT_OK) {
                var mensaje = it.data?.getStringExtra("mensaje").toString()
                Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            }
        }
}