package com.ketrizsoftware.kotlinderslerikasimadalanodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonGitA.setOnClickListener {
            Navigation.findNavController(binding.buttonGitA).navigate(R.id.sayfaAFragment)
        }

        binding.buttonGitX.setOnClickListener {
            Navigation.findNavController(binding.buttonGitX).navigate(R.id.sayfaXFragment)
        }

        return binding.root
    }
}