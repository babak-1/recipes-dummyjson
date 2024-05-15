package com.babak.recipesdummyjson.api

import retrofit2.create

class ApiUtilis {
    companion object{
        fun createApi():ApiManager{
            return RetrofitClient.retrofit.create(ApiManager::class.java)
        }
    }
}