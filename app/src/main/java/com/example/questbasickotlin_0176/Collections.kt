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
