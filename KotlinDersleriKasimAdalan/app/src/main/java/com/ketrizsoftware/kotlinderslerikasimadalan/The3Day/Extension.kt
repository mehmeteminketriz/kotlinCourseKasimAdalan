package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day

fun main() {
    val sonuc = 5.carpi (2)
    println(sonuc)
}

fun Int.carpi(sayi:Int) : Int{ // Int sınıfına fonksiyon yazdık
    return this*sayi // this: Int Sınıfı, 5 = this 2 = sayi
}

/*infix fun Int.carpi(sayi:Int) : Int{ // Int sınıfına fonksiyon yazdık
    return this*sayi // this: Int Sınıfı, 5 = this 2 = sayi
}*/
// infix yapınca val sonuc = 5 carpi 2 şeklinde yazabiliyoruz

