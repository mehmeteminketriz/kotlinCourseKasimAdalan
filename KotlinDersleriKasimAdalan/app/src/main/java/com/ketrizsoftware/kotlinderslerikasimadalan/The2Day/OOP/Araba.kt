package com.ketrizsoftware.kotlinderslerikasimadalan.The2Day.OOP

data class Araba (var renk: String, var hiz: Int, var calisiyorMu: Boolean) { // bu geter seter yapmak için yeterli (data)

    init {
        println("Class tan her nesne ürettiğimiz zaman ilk init fonksiyonu çalışır eğer init " +
                "Fonksiyonu yoksa constructor çalışır")
    }

    fun calistir(){ // side effect: fonksiyon ile sınıfın özelliklerini değiştirebilme
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }


    fun Okuma (model: String){
        println("$model Renk: ${renk}") // this.renk te yazılabilirdi java da olduğu gibi
        println("$model Max Hız: ${hiz}") // self var birde o da swift te geçerli
        println("$model Çalışıyor mu?: ${calisiyorMu}")
        // super: kalıtım varsa üst sınıfı temsil eder
    }


    fun hizlan(kacKm : Int){ // hızlandırma fonksiyonu
        hiz+=kacKm
    }

    fun yavasla(kacKm : Int){ // yavaşlatma fonksiyonu
        hiz-=kacKm
    }

}