package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day

// nullable - Nul safety - Optional(Swift)
fun main() {

    //var x:String // bu bizi yanıltmasın burda yazabilirz ama class içerisinde bu şekilde yazamayız

    //tanımlama
    var str : String? = null // soru işareti ile nullable olduğu belirtilir
    // str = "merhaba"

    // Yöntem1

    println("Yöntem1 : ${str?.trim()}") // trim boşlukları silmek baştaki ve sondaki
    // sorun varsa, null varsa uygulamayı çökertmez fakat null döner


    //yöntem2
    //println("Yöntem2 : ${str!!.trim()}")
    // iki önlemin soru işaretinden farkı bu iki önlem : koda güveniyorum burası null değil ama null olunca çökebilir


    //yöntem3
    if (str != null){
        println("Yöntem3 : ${str.trim()}")
    }else{
        println("sonuç null")
    }

    //yöntem4
    str?.let {
        println("Yöntem4: ${str.trim()}")
    }

}