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

    println("********ENUM CLASS*****++++")
    println(Dias.Lunes.numero)

    println("********Funciones*****++++")

    println(suma(3,2))
    println(suma2(4,3))
    imprimirSuma(5, 8)

    println("********if/else*****++++")

    var num1 = 1
    var num2 = 3
    var max: Int

    max = if(num1 > num2) {
            num1
        } else {
            num2
        }
    println(max)

    if(num1>num2) max=num1 else max=num2

    println(max)

    max = if(num1 > num2) num1 else num2
    println(max)

    val numeroEstu = 30

    if(numeroEstu in 1..50){
        println(numeroEstu)
    }

    println("********WHEN*****++++")

    var jk = 30

    when(jk) {
        1 -> {println("jk es 1")}
        2 -> {println("jk es 2")}
        3 -> {println("jk es 3")}
        4,5 -> {println("jk es 4 o 5")}
        else -> {println("No es ninguna de las anterios")}
    }

    when(jk) {
        in 1..10 -> println("jk esta en el rango")
        !in 10..20 -> print("jk no esta en el rango")
        else -> println("No es ninguna de las anterios")
    }

    println("********FOR LOOPS*****++++")

    //Listas

    var listaNombres = listOf<String>("Juan", "Rosa", "Antonio", "Marisol")
    println(listaNombres.get(2))
    println(listaNombres.indexOf("Juan"))

    var listaAnimales = mutableListOf<String>("Perro", "Gato", "Conejo", "Pez")
    listaAnimales.add("Hamster")
    println(listaAnimales)


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

    // ENUM CLASS
    enum class Dias(val numero: Int) {
        Lunes(0),
        Martes(1),
        Miercoles(2),
        Jueves(3),
        Viernes(4),
        Sabado(5),
        Domingo(6)
    }

    // Funciones
    fun suma(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }

    fun suma2(numero1: Int, numero2: Int) = numero1 + numero2

    fun imprimirSuma(numero1: Int, numero2: Int): Unit {
        println("La suma es ${numero1 + numero2}")
    }



