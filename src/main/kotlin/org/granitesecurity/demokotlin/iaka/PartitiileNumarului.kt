package org.granitesecurity.demokotlin.iaka

var partitions = IntArray(0);
var sumP = 0;
var n: Int = 0;

fun main() {
    println("Enter n:")
    n = readLine()?.toInt() ?: run {
        println("Enter a valid integer.")
        return
    }
    partitions = IntArray(n+1);
    partitions[0] = 1;

    generatePartitions(1);
}

fun generatePartitions(k: Int) {
    if(sumP == n) {
        printPartitions(k);
        return;
    }
    for (i in partitions[k-1]..n-sumP) {
        partitions[k] = i;
        sumP += i;
        generatePartitions(k+1);
        sumP -= i;
    }
}

fun printPartitions(n: Int) {
    partitions
        .drop(1) // Skip the first element (partitions[0] = 1)
        .take(n-1)
        .joinToString(prefix = "[", postfix = "]", separator = ", ")
        .also { println(it) }
}
