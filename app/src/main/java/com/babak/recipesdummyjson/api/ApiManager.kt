package com.babak.recipesdummyjson.api

import com.babak.recipesdummyjson.api.models.AllCardsModel
import com.babak.recipesdummyjson.api.models.CardModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiManager {
    @GET("recipes")
    fun getAllCards():Call<AllCardsModel>
    @GET("recipes/{id}")
    fun getOneCard(@Path("id") id:String):Call<CardModel>
}