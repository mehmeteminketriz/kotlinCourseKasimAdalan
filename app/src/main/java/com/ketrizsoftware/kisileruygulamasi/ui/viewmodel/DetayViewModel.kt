package com.ketrizsoftware.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.ketrizsoftware.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DetayViewModel : ViewModel() {

    var krepo = KisilerRepository()

    fun Guncelle(kisi_id:Int,kisi_ad:String, kisi_tel:String){
        CoroutineScope(Dispatchers.Main).launch{
            krepo.Guncelle(kisi_id,kisi_ad,kisi_tel)
        }
    }
}