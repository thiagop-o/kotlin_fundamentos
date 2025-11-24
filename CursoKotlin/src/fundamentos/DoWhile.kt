package fundamentos

fun main() {
    var opcao: Int

    do {
        val line = readlnOrNull() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("voce escolheu a opcao: $opcao")
    }while (opcao != -1)

    println("Ate a proxima")
}