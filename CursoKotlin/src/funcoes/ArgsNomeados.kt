package funcoes

fun relacaoTrabalho(chefe: String, funcionario: String): String {
    return "funcionario $funcionario é subordidado de $chefe"
}

fun main() {
    println(relacaoTrabalho("Joao", "Maria"))
    println(relacaoTrabalho(funcionario = "Carlos", chefe = "Roberto"))
}