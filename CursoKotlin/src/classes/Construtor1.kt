package classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }

    override fun toString(): String {
        return "$nome, $anoLancamento, $genero"
    }
}

fun main() {
    val filme = Filme("Avatar", 2025, "Fantasia")
    println(filme)

}