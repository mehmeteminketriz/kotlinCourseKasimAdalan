package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day

fun main() {

    var ucret = ucretHesapla(1000,KonserveBoyut.BUYUK)
    println(ucret)

}


fun ucretHesapla(adet:Int,boyut:KonserveBoyut){
    when (boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet ${adet*10} ₺")
        KonserveBoyut.ORTA -> println("Toplam Maliyet ${adet*20} ₺")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet ${adet*30} ₺")
        else -> println("Yanlış Seçim")
    }
}