package com.ye.kotlin

var nueva = 3

fun incrementarNueva(){
    nueva += 1
}

fun main() {
    println("********VARIABLES*****++++")
    var a : Int = 2
    a = 3
    var b : Int = 4
    var c : Int = a +b
    println(c)

    println(2.times(3))

    val d : Int = 20
    // d = 21

    val e : Int = 1 // Asignación inmediata
    val f = 2 // Tipo Int inferido
    val g : Int // El tipo es requerido si no se inicializa variable
    g = 3

    val x = "hola"
    println("$x.length es ${x.length}")

    println(nueva)
    incrementarNueva()
    println(nueva)


}