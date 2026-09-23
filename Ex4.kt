package TP7

fun main() {
    val utilisateurs = mutableMapOf("Aymen" to 20, "two" to 22)
    utilisateurs["Aymen"] = 25
    utilisateurs.remove("three", 3)
    println(utilisateurs["Aymen"])
    println(utilisateurs)
}