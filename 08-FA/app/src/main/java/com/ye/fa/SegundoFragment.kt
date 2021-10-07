package com.ye.fa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SegundoFragment : Fragment(R.layout.fragment_segundo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // view.findViewById<TextView>(R.id.txtMensaje).text = "Hola!!!!!"
    }

}