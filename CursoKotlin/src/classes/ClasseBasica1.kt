package classes

class Cliente{
    var nome: String = ""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Joao"

    println(cliente.nome)
}