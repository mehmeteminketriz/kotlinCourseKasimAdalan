package com.ketrizsoftware.kotlinderslerikasimadalan.The4Day.Collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("elma")
    meyveler.add("elma") // ikinci defa aynı değeri atadık hata yok ama dizi içine aktarmıyor
    meyveler.add("kiraz")
    meyveler.add("muz")
    meyveler.add("kavun")

    println(meyveler)

    println(meyveler.elementAt(2))
    println(meyveler.isEmpty())
    println(meyveler.size)


    /*Kotlin programlama dilinde "iterate" kelimesi, bir dizi veya
    koleksiyon içindeki elemanları sırayla geçerek her eleman üzerinde belirli bir işlem yapma işlemine denir.
     */
    for ((i,m) in meyveler.withIndex()){
        println("$i --> $m")
    }

    //silme
    meyveler.remove("elma")
    println(meyveler)

}