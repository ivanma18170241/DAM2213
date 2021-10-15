package com.ye.recyclerview.data

import com.ye.recyclerview.model.Shoe

class Datasource {
    fun cargarZapatos(): List<Shoe>{
        return listOf<Shoe>(
            Shoe("Flat", 24, "Negro"),
            Shoe("Sneaker", 28, "Azul"),
            Shoe("Zapato uno", 23, "Verde"),
            Shoe("Zapato dos", 22, "Rosa"),
            Shoe("Zapato tres", 27, "Azul"),
            Shoe("Zapato cuatro", 26, "Cafe"),
            Shoe("Zapato ocho", 24, "Verde"),
            Shoe("Zapato doce", 23, "Azul"),
            Shoe("Zapato trece", 25, "Negro"),
            Shoe("Zapato ocho", 24, "Verde"),
            Shoe("Zapato doce", 23, "Azul"),
            Shoe("Zapato trece", 25, "Negro")
        )
    }
}