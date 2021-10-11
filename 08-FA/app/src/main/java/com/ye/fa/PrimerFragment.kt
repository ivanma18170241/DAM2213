package com.ye.fa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.ye.fa.databinding.FragmentPrimerBinding

/**
 * A simple [Fragment] subclass.
 * Use the [PrimerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimerFragment : Fragment() {

    private lateinit var binding: FragmentPrimerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer, container, false)
        /* binding = FragmentPrimerBinding.inflate(layoutInflater)
        return binding.root */
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // binding.txtMensaje.text = "Hola!!!"
        view.findViewById<TextView>(R.id.txtMensaje).text = "Hola!!!!!"

        val button = view.findViewById<Button>(R.id.btnNavegar)

        button.setOnClickListener {
           /* requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainerView, SegundoFragment.newInstance("Yeratzy", "Rojo"))
            } */

            findNavController().navigate(R.id.action_primerFragment_to_blankFragment)
        }
    }


}