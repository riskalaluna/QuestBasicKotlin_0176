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
}

