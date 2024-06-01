package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day

fun main() {
    var nesneA = ASinifi()

    /*println(nesneA.x)
    nesneA.metod()*/

    /* Virtual object - Sanal Nesne - İsimsiz nesne
    println(ASinifi().x)
    ASinifi().metod()*/

    println(ASinifi.x)
    ASinifi.metod()
    // static ile virtual object arasındaki fark parantez static yaptığımız zaman parantez kullanamıyoruz
    // perfotmasn olarak static daha performanslı
}


