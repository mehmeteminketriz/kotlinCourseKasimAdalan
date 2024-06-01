package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day.TryCatchKullanimi

import java.lang.Exception


fun main() {
    // Compile Error

    val x = 10
    //x = 300


    // Exception = Runtime Error

    val a = 10
    val b = 2


    try { // hata çıkabilme ihtimali olan kodu try içine alıyoruz
        println("Sonuç ${a/b}") // b 0 olursa exception fırlatır ve uygulama çöker
        println("işlem tamam")
    }catch (e:Exception){
        println("Bir sayı sıfıra bölünemez !!!") // buryaa da hata oluşunca çıkacak uyarı mesajı yazılır

    }

}