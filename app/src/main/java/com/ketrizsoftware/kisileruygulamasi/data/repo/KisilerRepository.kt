package com.ketrizsoftware.kisileruygulamasi.data.repo

import com.ketrizsoftware.kisileruygulamasi.data.datasource.KisilerDataSource

class KisilerRepository {

    var kds = KisilerDataSource()
    suspend fun Kaydet(kisi_ad:String, kisi_tel:String) {
        kds.Kaydet(kisi_ad,kisi_tel)
    }
}