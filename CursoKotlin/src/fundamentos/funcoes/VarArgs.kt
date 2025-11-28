package fundamentos.funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(38,3,456,8,51,10,23)){
        println(n)
    }
}