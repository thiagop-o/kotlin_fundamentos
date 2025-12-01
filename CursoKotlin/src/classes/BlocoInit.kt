package classes

class Filme3 (
    nome: String,
    anoLancamento: Int,
    genero: String
){
    val nome: String
    val anoLancamento: Int
    val genero: String
    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }

    override fun toString(): String {
        return "$nome, $anoLancamento, $genero"
    }
}

fun main() {
    val filme = Filme3("star wars", 1978, "Ficcao")
    println(filme)
}