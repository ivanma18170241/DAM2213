package com.ye.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ye.recyclerview.R
import com.ye.recyclerview.model.Shoe

class ShoeAdapter(private val dataset: List<Shoe>): RecyclerView.Adapter<ShoeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // AQUI VINCULAMOS NUESTRA VISTA

        val nombre = view.findViewById<TextView>(R.id.txtShoeName)
        val talla = view.findViewById<TextView>(R.id.txtShoeSize)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_shoe, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val shoe = dataset[position]
        holder.nombre.text = shoe.nombre
        holder.talla.text = shoe.talla.toString()
    }

    override fun getItemCount(): Int = dataset.size
}