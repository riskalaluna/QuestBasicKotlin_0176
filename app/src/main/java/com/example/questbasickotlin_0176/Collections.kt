package com.example.questbasickotlin_0176

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList(){
    println("==List==")
    //List Read-Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangle")
    println(shape)

    // Menambahkan data ke dalam list Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari list Mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    // List Read Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data untik (tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {
    println()
    println("== Set ==")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> =
        mutableSetOf("Circlr", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}