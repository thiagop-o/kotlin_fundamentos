package fundamentos

fun main() {
    val a: Int? = null

    println(a?.dec())

    println("Forçando erro")
    println(a!!.dec())
}