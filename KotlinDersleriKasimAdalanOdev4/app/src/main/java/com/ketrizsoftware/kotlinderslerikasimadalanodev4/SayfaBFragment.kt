package com.ketrizsoftware.kotlinderslerikasimadalanodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentAnasayfaBinding
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonGitY.setOnClickListener {
            Navigation.findNavController(binding.buttonGitY).navigate(R.id.sayfaYFragment)
        }

        return binding.root
    }
}