package TP7

fun main() {
    val listeMutable = mutableListOf(1, 2, 3, 4)
    val listeImmuable: List<Int> = listeMutable.toList()
    listeMutable.sort()
    println(listeMutable)
    println(listeImmuable)
}