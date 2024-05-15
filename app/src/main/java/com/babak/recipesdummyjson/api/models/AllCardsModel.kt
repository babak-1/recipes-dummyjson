package com.babak.recipesdummyjson.api.models


import com.google.gson.annotations.SerializedName

data class AllCardsModel(
    @SerializedName("limit")
    val limit: Int?,
    @SerializedName("recipes")
    val recipes: ArrayList<CardModel>?,
    @SerializedName("skip")
    val skip: Int?,
    @SerializedName("total")
    val total: Int?
)