package com.example.questbasickotlin_0176

// Conditional Expression
// Conditional Expression adalah Ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional Expression menggunakan if-else, when, dan try-catch

fun ConditionalStatement() {
    println("== Conditional Expression ==")

    // If-Else
    val number = 10
    if (number > 10) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // When
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    // Try-Catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

fun Perulangan () {
    println()
    println("== Perulangan ==")

    for (i in 1..5) {
        println("Pengulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

fun main(){
    ConditionalStatement()
    Perulangan()
}