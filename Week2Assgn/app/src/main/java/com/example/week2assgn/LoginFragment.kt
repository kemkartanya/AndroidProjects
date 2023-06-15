package com.example.week2assgn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.navigation.Navigation


class LoginFragment : Fragment() {

    private lateinit var btn_login: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                activity?.let { finishAffinity(it) }
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        btn_login = view.findViewById(R.id.btnlogin)

        btn_login.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_passwordFragment)
        }

        return view
    }

}