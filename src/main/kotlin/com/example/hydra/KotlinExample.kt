package com.example.hydra

import com.example.hydra.dto.JavaPerson
import com.example.hydra.dto.KotlinPerson
import com.example.hydra.dto.ScalaPerson

fun demo(source: List<Int>): List<Int> {
    val list = ArrayList<Int>()
    // 'for'-loops work for Java collections:
    for (item in source) {
        list.add(item)
    }
    // Operator conventions work as well:
    for (i in 0..source.size - 1) {
        list[i] = source[i] // get and set are called
    }

    return list
}

fun main(args: Array<String>) {
    println("Hello World!")
    println(demo(listOf(1,2,3)))

    println(ScalaPerson("Yuhua", "Mai", 28))
    println(KotlinPerson("Yuhua", "Mai", 28))
    println(JavaPerson("Yuhua", 23))
}