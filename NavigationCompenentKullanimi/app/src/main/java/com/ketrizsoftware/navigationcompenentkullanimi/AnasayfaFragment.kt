package com.ketrizsoftware.navigationcompenentkullanimi

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.navigationcompenentkullanimi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener{
            //Snackbar.make(it,"Merhaba", Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Anasayfa Yazısı Değişti"

            val urun = Urunler(2003,"Ford Cargo")
            val gecis = AnasayfaFragmentDirections.detayGecis(urun = urun, isim = "Mehmet Emin", yas = 21,
                meslek = "Yazılım Mühendisi", hobi = "Film izlemek")

            Navigation.findNavController(binding.buttonDetay).navigate(gecis)

        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam Döngüsü", "On Create")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü", "On Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam Döngüsü", "On Resume")
    }
}