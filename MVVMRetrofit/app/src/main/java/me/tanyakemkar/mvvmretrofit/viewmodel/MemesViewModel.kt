package me.tanyakemkar.mvvmretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.tanyakemkar.mvvmretrofit.model.Jokes
import me.tanyakemkar.mvvmretrofit.repository.MemesRepository

class MemesViewModel(private val memesRepository: MemesRepository) : ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO) {
            memesRepository.getMemes()
        }
    }

    val memes : LiveData<Jokes>
    get() = memesRepository.memes
}