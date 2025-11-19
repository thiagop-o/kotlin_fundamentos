package fundamentos.controles

fun main() {
    val nota = 10

    when(nota){
        in 7..10 -> println("aprovado")
        in 5..6 -> println("recuperacao")
        else -> println("reprovado")
    }

}