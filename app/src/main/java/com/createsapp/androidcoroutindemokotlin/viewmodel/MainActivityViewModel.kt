package com.createsapp.androidcoroutindemokotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.createsapp.androidcoroutindemokotlin.model.CategoryItem
import com.createsapp.androidcoroutindemokotlin.network.RetroInstance
import com.createsapp.androidcoroutindemokotlin.network.RetroService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    lateinit var recyclerListLiveData: MutableLiveData<ArrayList<CategoryItem>>

    init {
        recyclerListLiveData = MutableLiveData()
    }

    fun getRecyclerListObserver(): MutableLiveData<ArrayList<CategoryItem>> {
        return recyclerListLiveData
    }

    fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
           val retroInstance = RetroInstance.getRetroInstance().create(RetroService::class.java)
            val response = retroInstance.getDataFromApi()
            recyclerListLiveData.postValue(response)
        }
    }
}