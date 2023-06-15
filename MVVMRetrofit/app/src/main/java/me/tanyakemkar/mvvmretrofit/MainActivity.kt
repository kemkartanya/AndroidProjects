package me.tanyakemkar.mvvmretrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import me.tanyakemkar.mvvmretrofit.api.ApiInterface
import me.tanyakemkar.mvvmretrofit.api.ApiUtilities
import me.tanyakemkar.mvvmretrofit.repository.MemesRepository
import me.tanyakemkar.mvvmretrofit.viewmodel.MemesViewModel
import me.tanyakemkar.mvvmretrofit.viewmodel.MemesViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var memesViewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)

        val memesRepository = MemesRepository(apiInterface)

        memesViewModel = ViewModelProvider(this, MemesViewModelFactory(memesRepository)).get(MemesViewModel::class.java)

        (memesViewModel as MemesViewModel).memes.observe(this) {
            Log.d("SHUBH", "onCreate: ${it.toString()}")

            it.data.memes.iterator().forEach {meme ->
                Log.d("", "name: ${meme.name} \n image : ${meme.url}")
            }
        }
    }
}