package com.ketrizsoftware.kotlinderslerikasimadalan.The2Day

fun main() {

    val a = 40
    val b = 50
    val c = 60
    val d = 70

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a < b : ${a < b}")
    println("a > b : ${a > b}")
    println("a <= b : ${a <= b}")
    println("a >= b : ${a >= b}")

    println("a < b || c < d : ${a < b || c < d}")
    println("a < b && c < d : ${a < b && c < d}")

    // if

    var isim = "Mehmet"

    var ka = "mehmeteminketriz"
    var s = 123

    if (isim == "Mehmet") {
        println("Hoşgeldin, $isim")

    }else{
        println("Kayıtlı Kullanıcı yok")
    }

    if (ka == "mehmeteminketriz" && s == 123){
        println("Başarılı Giriş")
    }else{
        println("Hatalı Giriş")
    }

    // when - Switch

    val gun = 4

    when(gun){
        1 -> println("pazartesi")
        2-> println("salı")
        3 -> println("çarşamba")
        4 -> println("perşembe")
        else -> println("Böyle bir gün yok")
    }

}