package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day

fun main() {
    val topkapiSarayi = Saray(4,300)
    val bebekVilla = Villa(true,50)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bebekVilla.pencereSayisi)
    println(bebekVilla.garajVarMi)

    if (topkapiSarayi is Saray){
        println("Saraydır")
    }else{
        println("Saray değildir")
    }

    // UpCasting (Sub (Villa) classı Super (Ev) Classa Dönüştürüyoruz)

    val ev:Ev = bebekVilla


    // DownCasting

    val ev1 = Ev(50)

    val saray:Saray = ev1 as Saray
}