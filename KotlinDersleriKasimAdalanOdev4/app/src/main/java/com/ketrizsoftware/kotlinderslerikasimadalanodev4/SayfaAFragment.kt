package com.ketrizsoftware.kotlinderslerikasimadalanodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentAnasayfaBinding
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {
    private lateinit var binding: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonGitB.setOnClickListener {
            Navigation.findNavController(binding.buttonGitB).navigate(R.id.sayfaBFragment)
        }

        return binding.root
    }
}