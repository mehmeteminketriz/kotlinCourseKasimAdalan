package com.ketrizsoftware.kotlinderslerikasimadalan.The3Day.Odev

class Odev {

    fun cevirme(km:Double) : Double{
        return km*0.621
    }

    fun dikdortgenAlan(uzunKenar:Int,kisaKenar:Int){
        var alan = uzunKenar*kisaKenar
    }

    fun faktoriyel(sayi:Int): Long{
        var factoriyel : Long = 1
        for (i in 1..sayi){
            factoriyel *= i
        }
        println(factoriyel)
        return factoriyel.toLong()
    }

    fun metin(metin:String){
        var eHarfi =0
        for (harf in metin){
            if (harf == 'e' || harf == 'E'){
                eHarfi++
            }
        }

        println(eHarfi)

    }

    fun eHarfiSayisiBul(kelime: String){
        var eHarfiSayisi = 0
        for (harf in kelime) {
            if (harf == 'e' || harf == 'E') {
                eHarfiSayisi++
            }
        }
        println(eHarfiSayisi)
    }

    fun icAciHesaplama(kenarSayisi:Int) : Int{
        val icAciToplam = ((kenarSayisi-2)*180)/kenarSayisi
        return icAciToplam
    }

    fun maasHesaplama(gunSayisi:Int):Int{

        var maas  =0

        var gunlukCalismaSaati = 8

        var saat = gunSayisi*gunlukCalismaSaati

        saat = gunSayisi*gunlukCalismaSaati

        if (saat>150){ // mesai ücreti
            var mesai = saat-150
            maas = (150*40) + (mesai*80)
        }else{
            maas = saat*40
        }

        return maas
    }

    fun otoPark(otoParkSuresi:Float) : Float{
        var otoParkUcreti:Float=0f
        if (otoParkSuresi<=1){
            otoParkUcreti = 50.0f
        }else{
            otoParkUcreti = 50f+((otoParkSuresi-1)*10)
        }
        return otoParkUcreti
    }


}