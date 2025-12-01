package classes

class Geladeira(
    val marca: String,
    val litros: Int
)

data class Televisao(
    val marca: String,
    val polegadas: Int
)

fun main() {
    val brastemp = Geladeira("Brastemp", 320)
    val brastemp2 = Geladeira("Brastemp", 320)

    println(brastemp == brastemp2)

    val samsung = Televisao("samsung", 55)
    val samsung2 = Televisao("samsung", 55)

    println(samsung == samsung2) //equals
    println(samsung === samsung2)
    println(samsung.toString())

    //destructuring
    val (marca, pol) = samsung
    println("$marca, $pol")
}