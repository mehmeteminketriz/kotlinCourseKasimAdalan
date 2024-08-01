package com.ketrizsoftware.kisileruygulamasi.data.repo

import com.ketrizsoftware.kisileruygulamasi.data.datasource.KisilerDataSource
import com.ketrizsoftware.kisileruygulamasi.data.entity.Kisiler

class KisilerRepository {

    var kds = KisilerDataSource()
    suspend fun Kaydet(kisi_ad:String, kisi_tel:String) {
        kds.Kaydet(kisi_ad,kisi_tel)
    }

    suspend fun Guncelle(kisi_id:Int,kisi_ad:String, kisi_tel:String){
        kds.Guncelle(kisi_id,kisi_ad,kisi_tel)
    }

    suspend fun sil(kisi_id:Int){
        kds.sil(kisi_id)
    }
    suspend fun kisileriYukle() : List<Kisiler> = kds.kisileriYukle()

    suspend fun ara(aramaKelimesi:String):List<Kisiler> = kds.ara(aramaKelimesi)

}