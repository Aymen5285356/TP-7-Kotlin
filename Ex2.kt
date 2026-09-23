package TP7

fun main() {
    val liste = mutableListOf("Aymen", "Mohamed", "hihi")
    liste.add("yassine")
    liste.remove("hihi")
    println(liste.contains("yassine"))
    println("taille : ${liste.size}")
    println(liste)
}