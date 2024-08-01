package com.ketrizsoftware.kisileruygulamasi.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.kisileruygulamasi.R
import com.ketrizsoftware.kisileruygulamasi.databinding.FragmentKayitBinding
import com.ketrizsoftware.kisileruygulamasi.ui.viewmodel.KayitViewModel


class KayitFragment : Fragment() {
    private lateinit var binding: FragmentKayitBinding
    private lateinit var viewModel: KayitViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_kayit, container, false)

        binding.kisiKayitToolbar = "Kişi Kayıt"
        binding.kayitFragment = this
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // tempViewModel geçici view model anlamına geliyor
        val tempViewModel:KayitViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun buttonKaydet(kisi_ad:String, kisi_tel:String){
        viewModel.Kaydet(kisi_ad,kisi_tel)

        var textViewAd = binding.editTextKisiAdi.text.toString().trim()
        var textViewTel = binding.editTextKisiTel.text.toString().trim()

        if (textViewAd.isEmpty() && textViewTel.isEmpty()){
            Snackbar.make(binding.buttonKaydet,"Hiçbir veri eklenmedi",Snackbar.LENGTH_SHORT).show()
        }else{
            Log.e("kişi kaydet","$kisi_ad - $kisi_tel")

            // Snackbar gösterme işlemi
            Snackbar.make(binding.buttonKaydet, "Kaydedildi", Snackbar.LENGTH_SHORT).show()

            // Ana ekrana dönme işlemi
            requireActivity().supportFragmentManager.popBackStack()
        }
    }
}