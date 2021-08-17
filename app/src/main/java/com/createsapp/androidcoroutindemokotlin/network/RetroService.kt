package com.createsapp.androidcoroutindemokotlin.network

import com.createsapp.androidcoroutindemokotlin.model.CategoryItem
import retrofit2.http.GET

interface RetroService {

    @GET("Category.php")
    suspend fun getDataFromApi(): ArrayList<CategoryItem>
}