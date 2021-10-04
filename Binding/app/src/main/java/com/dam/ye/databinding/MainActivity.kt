package com.dam.ye.databinding

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.URLUtil
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.dam.ye.databinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

       /*/ binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) */

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.name = "Mi nombre"

        binding.btnAdd.setOnClickListener {
            Toast.makeText(this, "Vinculación", Toast.LENGTH_SHORT).show()
            addAction()
        }

        binding.btnSend.setOnClickListener {
            binding.cvPerson.visibility = View.GONE
        }

        binding.btnSkip.setOnClickListener { view ->
            binding.cvPerson.visibility = View.GONE
            Snackbar.make(view, "Ocultando persona", Snackbar.LENGTH_LONG)
                .setAnchorView(binding.btnAdd)
                .setAction("Deshacer") {
                    binding.cvPerson.visibility = View.VISIBLE
                    Toast.makeText(this, "Deshacer acción activada", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        binding.enable.setOnClickListener {
            binding.tilLink.isEnabled = binding.enable.isChecked
        }
    }

    private fun addAction() {
       val idSelection = binding.rgColors.checkedRadioButtonId

        when(idSelection) {
            R.id.rbRed -> binding.imgOther.setBackgroundColor(Color.parseColor("#FF0000"))
            R.id.rbBlue -> binding.imgOther.setBackgroundColor(Color.parseColor("#0000FF"))
            else -> binding.imgOther.setBackgroundColor(Color.parseColor("#CCCCCC"))
        }

        val url = binding.edLink.text.toString()
        var error: String? = null

        if(url.isEmpty()){
            error = "Url vacía"
        } else if(URLUtil.isValidUrl(url)){
            Glide.with(this) // Contexto
                .load(url) // URL
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(binding.imgOther)

            binding.edLink.setText("")
            error = null
        } else {
            error = "URL invalida"
        }

        binding.tilLink.error = error

    }
}