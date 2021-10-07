package com.ye.nulllambdahoc

fun main() {
    var nombre: String? = null
    println(nombre?.length ?: "Jesus".length)

    nombre?.let {
        println(it)
    }

    println("--------------------------------")

    /*Expresiones lambdas*/

    val nada: (Int) -> Int = { value -> value }
    println(nada(2))

    val cuadrado: (Int) -> Int = { numero -> numero * numero }
    println(cuadrado(2))

    val suma: (Int, Int) -> Int = { a, b -> a + b }
    println(suma(1, 2))

    /*Expresiones de orden superior*/


    pasarFuncion(1) {
        // HAGO LO QUE QUIERO!!!
        println("suma : ${it+4}")
    }
}

fun pasarFuncion(num: Int, myFun: (Int) -> Unit){
    // mi codigo
    // .....
    // asignaciones
    myFun(num)
}

fun suma(num1: Int, num2: Int): Int{
    return num1 + num2
}