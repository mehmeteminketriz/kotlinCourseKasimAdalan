package com.ketrizsoftware.kotlinderslerikasimadalan.The2Day.OOP

fun main() {
    // Nesne oluşturma

    val mercedes = Araba("Gri",130,true)

    val jetta = Araba("Beyaz",100,true)

    //------------------------------------------------------------------------------
    // okuma

    /*println("Mercedes Renk: ${mercedes.renk}")
    println("Mercedes Max Hız: ${mercedes.maxHiz}")
    println("Mercedes Çalışıyor mu?: ${mercedes.calisiyorMu}")*/

    // aynı kodları çok kere yazamaktansa fonksiyon oluşturup tek satırda halletik


    //mercedes.Okuma("Mercedes")
    //jetta.Okuma("Jetta")

    //------------------------------------------------------------------------------
    //yazma - veri atama

    /*jetta.hiz = 200
    println(jetta.hiz)
    jetta.durdur()
    println("Jetta Çalışıyormu: ${jetta.calisiyorMu}")*/

    jetta.Okuma("Jetta")
    jetta.hizlan(50)
    jetta.Okuma("Jetta")
    jetta.yavasla(20)
    jetta.Okuma("Jetta")




}