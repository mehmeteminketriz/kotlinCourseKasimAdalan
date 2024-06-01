package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day

class Fonksiyonlar {

    // Void - Geri dönüş değeri olmayan

    fun selamla1(){
        val sonuc = "Merhaba Mehmet"
        println(sonuc)
    }

    // return - Geri dönüş değeri olan

    fun selamla2() : String {
        val sonuc = "Merhaba Emin"
        return sonuc
    }

    // parametreli fonksiyon


    fun selamla3(ad :String){
        val sonuc = "Merhaba $ad"
        println(sonuc)
    }

    fun toplama(sayi1:Int, sayi2:Int) : Int{
        val toplam = (sayi1+sayi2)
        return toplam
    }

    // overloading

    fun carp(sayi1:Int, sayi2:Int){
        println("Çarpma: ${sayi1*sayi2}")
    }

    fun carp(sayi1:Double, sayi2:Int){
        println("Çarpma: ${sayi1*sayi2}")
    }

    fun carp(sayi1:Int, sayi2:Double){
        println("Çarpma: ${sayi1*sayi2}")
    }

    fun carp(sayi1:Int, sayi2:Int, sayi3:Int){
        println("Çarpma: ${sayi1*sayi2*sayi3}")
    }

    // Extension : Var olan yapıları genişletmek





}