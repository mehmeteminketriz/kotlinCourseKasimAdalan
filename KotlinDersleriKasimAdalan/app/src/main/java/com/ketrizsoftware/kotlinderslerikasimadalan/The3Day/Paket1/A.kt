package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day.Paket1

open class A {

    // visibiliyty - acces modifier

    var varsayilanDegisken = 1
    public var publicDegisken = 2 // heryerden - public ve var aynı
    private var privateDegisken = 3 // sadece class içinden
    protected var  protectedDegisken = 4 // kalıtım (inheritance) yoluyla erişilebilir
    internal var  internalDegisken = 5 // intelij in yapısında modul denen bişey var o tür yapılarda var



    // protected a erişmek istiyorsak class ı open yapmak gerekiyor open demek kalıtım oluşturacağım anlamına gelir
    // open yaparsak başka bir klastan nesne üretmeye gerek kalmaz


    fun fonksiyonn(){
        println(privateDegisken)
    }

}