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

    println("********Clases/instancias*****++++")

    val persona = Persona("Manuel", 18)
    persona.presentacion()
    val persona2: Persona = Persona()
    persona2.nombre = "Jose"
    persona2.edad = 20
    persona2.presentacion()
    println("Nombre de la persona: ${persona.nombre}")

    println("********DATA CLASS*****++++")

    val usuario = Usuario("Yaattzy", "yeratzy.en@culiacan.tecn.mx")
    println(usuario.toString())
    val usuario2 = usuario.copy()
    println(usuario2)
    println("Los usurios son iguales: ${if(usuario == usuario2) "si son" else "no son"}")

    println("********CONSTANTES*****++++")
    println(Constates.fecha)


}
    // CLASE PERSONA
    class Persona(var nombre : String ="", var edad : Int = 0){
        fun presentacion() {
            println("La persona se llama $nombre y tiene $edad años.")
        }
    }

    // DATA CLASS USUARIO
    // Representa objetos para poder trabajar con ellos

    data class Usuario(val nombre: String, val correo: String)

   // Companion object
    class Constates {
        companion object {
            const val fecha = "8 septiembre de 2021"
        }
    }

