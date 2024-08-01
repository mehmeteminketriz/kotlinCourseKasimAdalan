package com.ketrizsoftware.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.ketrizsoftware.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KayitViewModel : ViewModel() {
    var krepo = KisilerRepository()
    fun Kaydet(kisi_ad:String, kisi_tel:String){
        // coroutine yapılı bir fonksiyonu coroutine olmayan bir yapıda çalıştıramazsınız
        // ya fonksiyon başına suspend ekleyeceğiz yada CoroutineScope sine alacağız
        CoroutineScope(Dispatchers.Main).launch {
            krepo.Kaydet(kisi_ad,kisi_tel)
        }
    }
}