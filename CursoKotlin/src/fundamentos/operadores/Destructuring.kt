package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca-$modelo")

    val (marido, mulher) = listOf("Joao", "Maria")
    println("$marido e $mulher")

    val (_, _, terceiraFruta) = listOf("Maça", "Uva", "Pera")
    println(terceiraFruta)
}