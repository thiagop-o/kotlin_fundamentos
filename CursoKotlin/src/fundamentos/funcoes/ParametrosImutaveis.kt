package fundamentos.funcoes

fun incremento(num: Int){
    num++
}

fun main() {
    incremento(3) // da erro, pois parâmetros são imutáveis não podendo ter reatribuição.
}