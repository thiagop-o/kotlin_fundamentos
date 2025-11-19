package fundamentos.controles

fun main() {
    var opcao: Int = 0

    while(opcao != -1){
        val line = readlnOrNull() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Voce escolheu $opcao")


    }
    println("Ate a proxima")
}