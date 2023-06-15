package me.tanyakemkar.mvvmretrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import me.tanyakemkar.mvvmretrofit.api.ApiInterface
import me.tanyakemkar.mvvmretrofit.model.Jokes

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