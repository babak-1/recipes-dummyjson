package com.babak.recipesdummyjson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.babak.recipesdummyjson.api.ApiUtilis
import com.babak.recipesdummyjson.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {
    private var _binding:FragmentDetailsBinding?=null
    private val binding get() = _binding!!
    private val api = ApiUtilis.createApi()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun getOneCard(){

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}