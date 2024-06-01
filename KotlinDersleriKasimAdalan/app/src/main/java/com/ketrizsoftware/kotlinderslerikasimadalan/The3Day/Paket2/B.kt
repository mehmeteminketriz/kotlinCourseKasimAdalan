package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day.Paket2

import com.ketrizsoftware.kotlinderslerikasimadalan.The3Day.Paket1.A

class B : A() // : ile kalıtım yapmış oluyoruz
    {
    fun fonksiyon(){
        val nesne = A()

        println(nesne.varsayilanDegisken)
        println(nesne.publicDegisken)
        println(nesne.internalDegisken)
        println(protectedDegisken) // kalıtım yaptığımız için nesne.protected yapmaya gerek kalmıyor

    }
}