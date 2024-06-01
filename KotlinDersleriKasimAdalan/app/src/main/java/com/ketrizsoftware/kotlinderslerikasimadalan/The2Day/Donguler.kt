package com.ketrizsoftware.kotlinderslerikasimadalan.The2Day

fun main() {

    for (i in 1..3){ // swift: i in 1...3
        println("Döngü 1: $i")
    }

    for (i in 10..20 step 5){
        println("Döngü 2: $i")
    }

    for (i in 20 downTo  10 step 5){
        println("Döngü 3: $i")
    }

    val dizi = listOf(10,20,30)

    for (deger in dizi){
        println("Dizi: $deger")
    }

    /*val test = ArrayList<String>()

    test.add("elma")
    test.add("armut")
    test.add("çilek")

    // until otomatik olarak dizilerdeki indeks değerinizi 1 azaltarak alır
    // normalde 0,1,2,3 beklenir ama unitilden sonra geleni 1 eksik sayar
    // ve 0,1,2 şeklinde sayar

    for (t in 0 until test.size){
        Log.e("test", t.toString())
    }*/


    var sayac = 1

    while (sayac<6){
        println(sayac)
        sayac+=1
        sayac++
    }

    for (i in 1..5){ // swift: i in 1...3
        if (i == 3){
            break // döngüyü durdurur
        }
        println("Döngü 4: $i")
    }

    for (i in 1..5){ // swift: i in 1...3
        if (i == 3){
            continue // döngüyü durdurmaz pas geçer
        }
        println("Döngü 5: $i")
    }
}