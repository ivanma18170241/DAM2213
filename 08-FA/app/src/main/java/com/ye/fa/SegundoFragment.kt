package com.ye.fa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf


class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    private var nombre: String? = ""
    private var color: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        nombre = requireArguments().getString(ARG_NOMBRE)
        color = requireArguments().getString(ARG_COLOR)
        */

        arguments?.let {
            nombre = it.getString(ARG_NOMBRE)
            color = it.getString(ARG_COLOR)
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         view.findViewById<TextView>(R.id.txtMensaje2).text = "$nombre - $color"
    }

    companion object {
        private const val ARG_NOMBRE = "nombre"
        private const val ARG_COLOR = "color"

        fun newInstance(nombre: String, color: String) =
            SegundoFragment().apply {
                arguments = bundleOf(ARG_NOMBRE to nombre, ARG_COLOR to color)

        }
    }

}


