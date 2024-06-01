package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day.Odev

fun main() {
    val odev = Odev()


    val gelenDeger = odev.cevirme(100.0)
    println(gelenDeger)

    odev.faktoriyel(7)
    odev.metin("Mehmet Emin")
    odev.eHarfiSayisiBul("Mehmet Emin")

    val icAci = odev.icAciHesaplama(4)
    println(icAci)

    var maas = odev.maasHesaplama(30)
    println(maas)

    var otoPark = odev.otoPark(2.5f)
    println(otoPark)
}