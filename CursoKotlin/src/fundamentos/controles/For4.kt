package fundamentos.controles

fun main() {
    val alunos = arrayListOf("Joao", "Andre", "Maria", "Benjamin", "Gustavo")

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}