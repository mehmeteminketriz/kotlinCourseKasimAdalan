package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day

fun main() {
    val f = Fonksiyonlar()

    f.selamla1()

    val gelenSonuc : String = f.selamla2()
    println(gelenSonuc)

    f.selamla3("Ketriz")

    val gelenToplam : Int = f.toplama(10,25)
    println(gelenToplam)


}