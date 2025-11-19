package fundamentos.controles

fun main() {
    val nota: Double = 9.3

    // usando operador range
    if (nota in 9.0..10.0){
        println("Fantastico")
    }else if (nota in 7.0..8.0){
        println("Parabens")
    }else if (nota in 4.0..6.0){
        println("Recuperacao")
    }else{
        println("Reprovado")
    }
}