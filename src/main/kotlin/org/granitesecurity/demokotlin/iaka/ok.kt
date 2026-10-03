package org.granitesecurity.demokotlin.iaka

fun main() {
    println("Hello, World!")

//    val numbers = intArrayOf(1, 2, 3, 4, 5)
//    for (n in numbers) {
//        println("n = $n")
//    }
//    var i = 0
//    while (i < 5) {
//        println("i = $i")
//        i++
//    }
    display()
}

fun display(str: String ="*", times: Int = 5): Unit {
    repeat(times) {
        print(str)
    }
    println()
}