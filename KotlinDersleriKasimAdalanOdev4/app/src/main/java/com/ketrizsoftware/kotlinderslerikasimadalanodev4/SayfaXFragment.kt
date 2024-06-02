package com.ketrizsoftware.kotlinderslerikasimadalanodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentSayfaBBinding
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonGitYX.setOnClickListener {
            Navigation.findNavController(binding.buttonGitYX).navigate(R.id.sayfaYFragment)
        }

        return binding.root
    }
}