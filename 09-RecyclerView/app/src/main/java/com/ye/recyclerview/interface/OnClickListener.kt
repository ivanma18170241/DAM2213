package com.ye.recyclerview.`interface`

import com.ye.recyclerview.model.Shoe
import java.text.FieldPosition

interface OnClickListener {
    fun onClick(shoe: Shoe, position: Int)
}