package fundamentos.operadores

import java.util.Date

fun main() {
    println("Banana" === "Banana")
    println(3 !== 2)

    val d1 = Date(0)
    val d2 = Date(0)

    // Igualdade referencial
    println("Igualdade com '===': ${d1===d2}")

    // Igualdade estrutural
    println("Igualdade com '==': ${d1==d2}") // == é o .equals do java
}