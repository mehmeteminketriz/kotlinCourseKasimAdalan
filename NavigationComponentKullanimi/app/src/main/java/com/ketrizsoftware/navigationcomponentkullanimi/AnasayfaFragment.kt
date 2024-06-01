package com.ketrizsoftware.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)




        binding.buttonDetay.setOnClickListener{
            //Snackbar.make(binding.buttonDetay,"Mehmet Emin Ketriz",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Anasayfa Yazısı Değişti"


            val kamyon = Kamyon("Ford","Cargo")
            val gecis = AnasayfaFragmentDirections.detayGecis(kamyon=kamyon, isim = "Mehmet Emin", yas = 21, meslek = "Yazılım Mühendisliği", hobi = "Film İzlemek")

            // Sayfalar Arası Geçiş

            Navigation.findNavController(binding.buttonDetay).navigate(gecis) // bu yapı ile butona basarak detay geçişi tetikledik

        }

        binding.buttonGoster.setOnClickListener{
            Navigation.findNavController(binding.buttonDetay).navigate(R.id.bottomSheetGecis)
        }


        return binding.root
    }

// Fragmetnelrin çalışmasını kontrol ettiğimiz bir bir yapı

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam Döngüsü","OnCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü","OnPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam Döngüsü","OnResume")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Yaşam Döngüsü","OnStart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Yaşam Döngüsü","OnStop")
    }
}