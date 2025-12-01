package classes

val diretamenteNoArquivo = "Bom Dia"

fun topLevel(){
    val local = "Fulano"
    println(diretamenteNoArquivo)
    println(local)
}

class Coisa {
    var variavelDeInstancia = "Boa noite"

    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse, $local, $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}