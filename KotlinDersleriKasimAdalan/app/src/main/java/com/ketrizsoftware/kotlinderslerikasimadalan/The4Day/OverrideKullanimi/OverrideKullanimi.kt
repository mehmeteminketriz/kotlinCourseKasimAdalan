package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day.OverrideKullanimi

fun main() {
    val hayvan = Hayvan() // nesne oluşturuldu
    println(hayvan.sesCikar())
    // üst sınıf doğal olarak kendi metodunu çağırır

    val memeli = Memeli() // nesne oluşturuldu
    println(memeli.sesCikar())
    // Alt sunuf üst sınıfın metodunu override etmesede üst sınıfın metodunu çalıştırır

    val kedi = Kedi() // nesne oluşturuldu
    println(kedi.sesCikar())
    // alt sınıf üst sınıfın metodunu oevrride ettiyse kendi sınıfın metodunu çağırır

    val kopek = Kopek() // nesne oluşturuldu
    println(kopek.sesCikar())
    // alt sınıf üst sınıfın metodunu oevrride ettiyse kendi sınıfın metodunu çağırır

}