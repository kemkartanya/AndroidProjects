package me.tanyakemkar.mvvmroomretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import me.tanyakemkar.mvvmroomretrofit.api.ApiInterface
import me.tanyakemkar.mvvmroomretrofit.model.Jokes

class MemesRepository(val apiInterface: ApiInterface) {

    private val memesLiveData = MutableLiveData<Jokes>()

    val memes : LiveData<Jokes>
        get() = memesLiveData

    suspend fun getMemes() {
        val result = apiInterface.getJokes()
        if(result.body() != null) {
            memesLiveData.postValue(result.body())
        }
    }
}