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

        binding.btnNavegar2.setOnClickListener {
            navegarActividadTres()
        }
    }

    private fun navegarActividadTres() {
        val intent = Intent(this, TerceraActivity::class.java)
        getResult.launch(intent)
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
           /* if(it.resultCode == Activity.RESULT_OK) {
                var mensaje = it.data?.getStringExtra("mensaje").toString()
                Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            }
            if(it.resultCode == 88) {
                binding.txtTitle.text = it.data?.getStringExtra("texto")
            }
            if(it.resultCode == 20) {
                binding.txtTitle.text = it.data?.getStringExtra("cancelar")
            }*/

            when(it.resultCode) {
                Activity.RESULT_OK -> {
                    var mensaje = it.data?.getStringExtra("mensaje").toString()
                    Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
                }
                88 ->  binding.txtTitle.text = it.data?.getStringExtra("texto")
                20 ->  binding.txtTitle.text = it.data?.getStringExtra("cancelar")
                else -> binding.txtTitle.text = "Nada"
            }
        }
}