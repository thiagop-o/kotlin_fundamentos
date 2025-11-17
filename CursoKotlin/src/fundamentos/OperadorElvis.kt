package fundamentos

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "valor padrao" // ?: operador elvis para atribuir um valor quando nulo

    println(obrigatorio)
}