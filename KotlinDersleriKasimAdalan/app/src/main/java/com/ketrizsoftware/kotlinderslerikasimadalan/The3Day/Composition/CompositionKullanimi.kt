package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day.Composition

fun main() {
    val k1 = Kategoriler(1,"dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")


    val y1 = Yonetmenler(1,"Quentin Tarantino")
    val y2 = Yonetmenler(2,"Christoper Nolan")

    val f1 = Filmler(1,"Django",2013,k1,y1)
    // burda composition yani veri tabanlarını bağlamayı uyguluyoruz
    //kategori (k1) yi nesne tabanlıya dönüştürdüğümüz için 1 yazmıyuoruz k1 yazıyoruz
    // aynı şekilde y1 yazmıyoruz y1 yazıyoruz

    println("Film id: ${f1.film_id}")
    println("Film ad: ${f1.film_ad}")
    println("Film yıl: ${f1.film_yil}")
    println("Film kategori: ${f1.kategori.kategori_ad}")
    println("Film yönetmen: ${f1.yonetmen.yonetmen_ad}")
}