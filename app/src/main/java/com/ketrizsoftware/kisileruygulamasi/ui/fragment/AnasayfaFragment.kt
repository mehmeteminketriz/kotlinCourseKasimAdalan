package com.ketrizsoftware.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ketrizsoftware.kisileruygulamasi.R
import com.ketrizsoftware.kisileruygulamasi.data.entity.Kisiler
import com.ketrizsoftware.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.ketrizsoftware.kisileruygulamasi.ui.adapter.KisilerAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        /*
        bu kutucuklu olmasını sağlar
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        */

        /*
        bu yatayda sağa sola çekerek görememizi sağlar
        binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        */


        // binding.rv.layoutManager diyerek tasarımsal yapılarımızın nasıl olacağını söylüyoruz
        binding.rv.layoutManager = LinearLayoutManager(requireContext()) // bu alt alta gözükmesini sağlayacak

        val kisilerListesi = ArrayList<Kisiler>()

        val k1 = Kisiler(1,"Babam","05448177242")
        val k2 = Kisiler(2,"Annem","05456933338")
        val k3 = Kisiler(3,"Usta","05459175045")
        val k4 = Kisiler(4,"Hafız","05441818382")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        kisilerListesi.add(k4)

        val kisilerAdapter = KisilerAdapter(requireContext(),kisilerListesi) // kisilerAdapter dan nesne ürettik
        binding.rv.adapter = kisilerAdapter // ve oluşturduğumuz adapteri recycler view e aktardık. Bu yapı olmadan görüntüleme yapamayız

        binding.fab.setOnClickListener {
            Navigation.findNavController(binding.fab).navigate(R.id.kayitGecis)
        }


        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener{

            // bu harf girdikçe ve sildikçe bize sonuç veriyor
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return true
            }

            // bu arama butonuna basınca bize sonuç veriyor
            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }
        })


        return binding.root
    }

    fun ara(aramaKelimesi:String){
        Log.e("Kişi Ara",aramaKelimesi)
    }

}