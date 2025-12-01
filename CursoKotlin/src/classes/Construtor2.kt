package classes

class Filme2(
    val nome: String,
    val anoLancamento: Int,
    val genero: String
){
    override fun toString(): String {
        return "$nome, $anoLancamento, $genero"
    }
}

fun main() {
    val filme = Filme2("avatar", 2015, "Ficcao")

    println(filme)
}