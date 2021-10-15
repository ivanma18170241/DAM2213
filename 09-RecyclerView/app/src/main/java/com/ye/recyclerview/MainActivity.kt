package com.ye.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ye.recyclerview.`interface`.OnClickListener
import com.ye.recyclerview.adapter.ShoeAdapter
import com.ye.recyclerview.data.Datasource
import com.ye.recyclerview.model.Shoe

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val listShoes = Datasource().cargarZapatos()

        recyclerView.adapter = ShoeAdapter(listShoes, this)
        recyclerView.setHasFixedSize(true)
    }

    override fun onClick(shoe: Shoe, position: Int) {
        Toast.makeText(this, "$position: ${shoe.nombre}", Toast.LENGTH_SHORT).show()
    }
}