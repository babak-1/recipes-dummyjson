package com.babak.recipesdummyjson.api

import com.babak.recipesdummyjson.api.models.AllCardsModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiManager {
    @GET("recipes")
    fun getAllCards():Call<AllCardsModel>
}