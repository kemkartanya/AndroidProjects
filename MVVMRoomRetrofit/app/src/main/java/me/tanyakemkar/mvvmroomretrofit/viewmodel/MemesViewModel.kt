package me.tanyakemkar.mvvmroomretrofit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.tanyakemkar.mvvmroomretrofit.repository.MemesRepository
import me.tanyakemkar.mvvmroomretrofit.model.Jokes

class MemesViewModel(private val memesRepository: MemesRepository) : ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO) {
            memesRepository.getMemes()
        }
    }

    val memes : LiveData<Jokes>
        get() = memesRepository.memes
}