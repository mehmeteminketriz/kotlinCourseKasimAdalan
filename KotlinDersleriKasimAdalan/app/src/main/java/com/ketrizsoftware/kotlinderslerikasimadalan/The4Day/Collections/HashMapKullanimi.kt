package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day.Collections

fun main() {

    // Dictionary

    val iller = HashMap<Int,String>()

    iller.put(21,"DİYARBAKIR")
    iller[34] = "İSTANBUL"
    iller.put(63,"ŞANLIURFA")
    iller.put(82,"SİVEREK")

    println(iller)
    println(iller.get(82))

    iller.put(82,"SiVeReK")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for ((indeks,iller) in iller){
        println("$indeks --> $iller")
    }


    iller.remove(63)
    println(iller)

    iller.clear()
    println(iller)
}