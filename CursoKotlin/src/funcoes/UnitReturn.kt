package funcoes

import kotlin.math.max

fun imprimirMaior1(a:Int, b:Int){
    println(max(a, b))
}

fun imprimirMaior2(a:Int, b:Int) {
    println(max(a, b))
}

fun imprimirMaior3(a:Int, b:Int) {
    println(max(a, b))
    return
}

fun main() {
    imprimirMaior1(4,6)
    imprimirMaior2(4,6)
    imprimirMaior3(4,6)
}
