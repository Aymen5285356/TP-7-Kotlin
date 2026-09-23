package TP7

fun main() {
    val ensemble = mutableSetOf(1, 2, 3)
    ensemble.add(4)
    ensemble.remove(2)
    println(ensemble.contains(3))
    println(ensemble)
}