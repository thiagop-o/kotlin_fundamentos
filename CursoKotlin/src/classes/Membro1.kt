package classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main() {
    val nascimento = Data(11, 10, 2003)
    with(nascimento) {println("$dia/$mes/$ano")}
    println(nascimento.formatar())
}