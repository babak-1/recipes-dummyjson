package com.babak.recipesdummyjson

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.babak.recipesdummyjson.adapters.AdapterCards
import com.babak.recipesdummyjson.api.ApiUtilis
import com.babak.recipesdummyjson.api.models.AllCardsModel
import com.babak.recipesdummyjson.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {
    private var _binding:FragmentHomeBinding?=null
    private val binding get() = _binding!!
    private val api= ApiUtilis.createApi()
    private val adapterCards=AdapterCards()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvHome.adapter=adapterCards
        getAllCards()
    }

    private fun getAllCards(){
        api.getAllCards().enqueue(object:Callback<AllCardsModel> {
            override fun onResponse(call: Call<AllCardsModel>, response: Response<AllCardsModel>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        it.recipes?.let {recipe->
                            adapterCards.updateList(recipe)
                        }

                    }
                }
            }

            override fun onFailure(call: Call<AllCardsModel>, t: Throwable) {
            }

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}