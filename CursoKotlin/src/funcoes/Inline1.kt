package funcoes

inline fun transacao (funcao: () -> Unit){
    println("Abrindo transacao...")
    try {
        funcao()
    } finally {
        println("Encerrando transacao....")
    }
}

fun main() {
    transacao {
        println("Executando SQL 1")
        println("Executando SQL 2")
    }
}
