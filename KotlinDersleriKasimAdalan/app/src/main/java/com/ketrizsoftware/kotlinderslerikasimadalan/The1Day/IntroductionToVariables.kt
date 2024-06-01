package com.ketrizsoftware.kotlinderslerikasimadalan.The1Day

fun main() {
    println("Hello World")

    var ogrenciAdi = "Ahmet"
    var yas = 34
    var ogrenciBoy = 1.98
    var ogrenciDevamEdiyorMu = true

   // println(ogrenciAdi+"\n"+yas+"\n"+ogrenciBoy+"\n"+ogrenciBasHarf+"\n"+ogrenciDevamEdiyorMu)


    var urun_id : Int = 3416
    var urun_adi : String = "MacbookPro"

    println("Öğrenci Adı: $ogrenciAdi \nYaş: $yas \nÖğrenci Boy: $ogrenciBoy \nÖğrenim Durumu: $ogrenciDevamEdiyorMu")


    // Sabitler - Constant
    // val(Kotlin) - let(swift) - final(java)

    val numara = 40
    //numara = 80

    // Tür Değişimleri - Type Casting

    val i = 42
    val d = 78.95
    val s = "mehmet"

    // sayısaldan sayısala dönüşüm
    val sonuc1 = i.toDouble() // i yi double yaptık
    val sonuc2 = d.toInt()   // d yi int yaptık

    println(sonuc1)
    println(sonuc2)


    // sayısaldan metine dönüşüm
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()

    println(sonuc3)
    println(sonuc4)

    // metinden sayısala dönüşüm

    val yazi = "63.82" // kullanıcı buraya yanlışlıkla metinsel bir ifade yazarsa hata verir.
    val sonuc5 = yazi.toDoubleOrNull() // OrNull yaparak hatayı giderebiliriz= Dönüştüremezsen null yap
    println(sonuc5)

    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşüm Hatası Oluştu")
    }

    sonuc5?.let {// değişken değeri null değilse let fonksiyonunun içindeki işlemler çalışır
        // ama null ise let fonksiyonu atlanır ve hata alınmaz
        // it = sonuc5, sonuc5 double olduğu için double yazıyor int olsaydı int yazacaktı
        println(it)
    }

}