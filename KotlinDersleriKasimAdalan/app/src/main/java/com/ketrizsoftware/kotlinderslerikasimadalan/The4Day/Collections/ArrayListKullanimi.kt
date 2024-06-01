package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day.Collections

fun main() {
    // tanımlama

    val sayilar = ArrayList<Int>() // dizimizin türünü büyük küçük işaretleri arasına yazıyoruz

    val meyveler = ArrayList<String>()

    // veri ekleme
    meyveler.add("Elma") // 0. index
    meyveler.add("Muz") // 1. index
    meyveler.add("Kiraz") // 2. index

    println(meyveler)

    // Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    // Insert - Ekleme

    meyveler.add(1,"Portakal") // 1. index e portakalı koydu yeni muz 2 oldu kiraz da 3
    println(meyveler)
    println("2. index : ${meyveler[2]}")

    // okuma

    println("3. index : ${meyveler[3]}")
    println("3. index : ${meyveler.get(3)}")

    // diziler ile ilgili bazı komutlar
    println("Eleman Sayısı: ${meyveler.size}")
    println("Eleman Sayısı: ${meyveler.count()}")
    println("Boş Kontrol: ${meyveler.isEmpty()}") // Dizi boş mu ?
    println("İçeriyor Mu? : ${meyveler.contains("Kiraz")}") // Dizi içindeki değerin aynısını yazmak gerekiyor

    meyveler.reverse() // dizi elemanlarını tersine çevirir
    println("2. index : ${meyveler[2]}")
    println("3. index : ${meyveler[3]}")

    meyveler.sort() // String değerleri Alfabeye göre sayısal değerleri küçükten büyüğe doğru sıralama
    println(meyveler)

    for (meyve in meyveler){// itereyting - dizi içindeki elemanlar üzerinde dönme
        println("Sonuç : $meyve")
    }

    for ((index,meyve) in meyveler.withIndex()){// IOS - withIndex = enumareted
        println("$index --> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler.isEmpty())

}