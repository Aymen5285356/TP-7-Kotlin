package TP7

fun String.containsSubstring(substring: String): Boolean {
    return this.contains(substring)
}
fun main(){
    val text1 = "Bonjour tout le monde"
    val text2 = "Kotlin est genial"

    println(text1.containsSubstring("tout"))
    println(text2.containsSubstring("Kotlin"))
    println(text2.containsSubstring("genial"))
}