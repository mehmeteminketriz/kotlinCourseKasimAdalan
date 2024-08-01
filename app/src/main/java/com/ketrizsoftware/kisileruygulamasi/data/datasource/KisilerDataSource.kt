package com.ketrizsoftware.kisileruygulamasi.data.datasource

import android.util.Log
import com.ketrizsoftware.kisileruygulamasi.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource {

    suspend fun kisileriYukle():List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi = ArrayList<Kisiler>()
            val k1 = Kisiler(1,"Babam","05448177242")
            val k2 = Kisiler(2,"Annem","05456933338")
            val k3 = Kisiler(3,"Usta","05459175045")
            val k4 = Kisiler(4,"Hafız","05441818382")
            kisilerListesi.add(k1)
            kisilerListesi.add(k2)
            kisilerListesi.add(k3)
            kisilerListesi.add(k4)

            return@withContext kisilerListesi
        }

    suspend fun ara(aramaKelimesi:String):List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi = ArrayList<Kisiler>()
            val k1 = Kisiler(1,"Babam","05448177242")
            kisilerListesi.add(k1)

            return@withContext kisilerListesi
        }



    suspend fun Kaydet(kisi_ad:String, kisi_tel:String){
        Log.e("Kişi Kaydet","$kisi_ad - $kisi_tel")

    }

    suspend fun Guncelle(kisi_id:Int,kisi_ad:String, kisi_tel:String){
        Log.e("Kişi Güncelle", "$kisi_id, $kisi_ad, $kisi_tel")
    }

    suspend fun sil(kisi_id:Int){
        Log.e("Kişi Sil",kisi_id.toString())
    }
}