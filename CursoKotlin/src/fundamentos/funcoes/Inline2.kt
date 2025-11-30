package fundamentos.funcoes

inline fun <T> executarComLog(nomeDaFuncao: String, funcao: () -> T): T{
    println("Entrando no metodo $nomeDaFuncao....")

    try{
        return funcao()
    } finally {
        println("Metodo $nomeDaFuncao finalizado")
    }
}

fun somar2 (a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val resultado = executarComLog("somar"){
        somar2(3,4)
    }

    println(resultado)
}