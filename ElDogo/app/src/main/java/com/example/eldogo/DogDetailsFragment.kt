package com.example.eldogo

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//1
class DogDetailsFragment : Fragment() {

    //2
    companion object {

        fun newInstance(): DogDetailsFragment {
            return DogDetailsFragment()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dog_details, container, false)
    }

}
