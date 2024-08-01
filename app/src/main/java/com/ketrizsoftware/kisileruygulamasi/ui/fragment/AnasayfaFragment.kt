package com.ketrizsoftware.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ketrizsoftware.kisileruygulamasi.R
import com.ketrizsoftware.kisileruygulamasi.data.entity.Kisiler
import com.ketrizsoftware.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.ketrizsoftware.kisileruygulamasi.ui.adapter.KisilerAdapter
import com.ketrizsoftware.kisileruygulamasi.ui.viewmodel.AnasayfaViewModel
import com.ketrizsoftware.kisileruygulamasi.ui.viewmodel.KayitViewModel

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var  viewModel : AnasayfaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        binding.anasayfaFragmentToolbar = "REHBERİM"
        binding.anasayfaFragment = this

        /*
        bu kutucuklu olmasını sağlar
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        */

        /*
        bu yatayda sağa sola çekerek görememizi sağlar
        binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        */


        // binding.rv.layoutManager diyerek tasarımsal yapılarımızın nasıl olacağını söylüyoruz
        // bu işi tasarımda halletik = binding.rv.layoutManager = LinearLayoutManager(requireContext()) // bu alt alta gözükmesini sağlayacak

        viewModel.kisilerListesi.observe(viewLifecycleOwner){
            val kisilerAdapter = KisilerAdapter(requireContext(),it,viewModel) // kisilerAdapter dan nesne ürettik
            binding.kisilerAdapter = kisilerAdapter // ve oluşturduğumuz adapteri recycler view e aktardık. Bu yapı olmadan görüntüleme yapamayız
        }


        binding.fab.setOnClickListener {
            Navigation.findNavController(binding.fab).navigate(R.id.kayitGecis)
        }


        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener{

            // bu harf girdikçe ve sildikçe bize sonuç veriyor
            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.ara(newText)
                return true
            }

            // bu arama butonuna basınca bize sonuç veriyor
            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.ara(query)
                return true
            }
        })


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // tempViewModel geçici view model anlamına geliyor
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }


    fun fabTiklama(it:View){
        Navigation.findNavController(it).navigate(R.id.kayitGecis)
    }

    override fun onResume() {
        super.onResume()
        viewModel.kisileriYukle()
    }
}