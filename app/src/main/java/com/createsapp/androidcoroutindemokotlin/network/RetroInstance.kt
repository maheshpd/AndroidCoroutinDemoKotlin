package com.createsapp.androidcoroutindemokotlin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {

    companion object {
        val BaseURL = "http://auralearning.xyz/Medico/"

        fun getRetroInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}