package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day.Collections

fun main() {
    val o1 = Ogrenciler(1744,"Mehmet Emin","10D")
    val o2 = Ogrenciler(161,"Enes","8E")
    val o3 = Ogrenciler(1453,"Yunus","1D")

    val ogrenciler = ArrayList<Ogrenciler>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)

    for (ogrenci in ogrenciler){
        println("No: ${ogrenci.no} -- Ad: ${ogrenci.ad} -- Sınıf: ${ogrenci.sinif}")
    }

    // Sort - Sıralama

    println("Numara Küçükten büyüğe ")
    val noKBSiralama = ogrenciler.sortedWith(compareBy{it.no}) // ASC = Ascend
    for (ogrenci in noKBSiralama){
        println("No: ${ogrenci.no} -- Ad: ${ogrenci.ad} -- Sınıf: ${ogrenci.sinif}")
    }


    println("Numara Büyükten küçüğe")
    val noBKSiralama = ogrenciler.sortedWith(compareBy<Ogrenciler> {it.no}.reversed()) //DESC = Descend
    val noBK2Siralama = ogrenciler.sortedWith(compareByDescending{it.no}) // bu da başka bir yolu
    for (ogrenci in noBKSiralama){
        println("No: ${ogrenci.no} -- Ad: ${ogrenci.ad} -- Sınıf: ${ogrenci.sinif}")
    }


    println("İsme Göre")
    val adKBSiralama = ogrenciler.sortedWith(compareBy{it.ad})
    for (ogrenci in adKBSiralama){
        println("No: ${ogrenci.no} -- Ad: ${ogrenci.ad} -- Sınıf: ${ogrenci.sinif}")
    }

    // Filtreleme
    println("Filtreleme")
    val filtre1 = ogrenciler.filter { it.no>161 }
    for (f1 in filtre1){
        println(" Nosu 161 den büyük -No: ${f1.no} -- Ad: ${f1.ad} -- Sınıf: ${f1.sinif}")
    }

    val filtre2 = ogrenciler.filter { it.ad.contains("Y") } // içinde n harfi olan tüm veriyileri getirecek
    for (f2 in filtre2){
        println(" İçinde Y harfi olan -No: ${f2.no} -- Ad: ${f2.ad} -- Sınıf: ${f2.sinif}")
    }
}