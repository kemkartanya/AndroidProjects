package com.example.week2assgn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class PasswordFragment : Fragment() {

    private lateinit var btn_pwd: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_password, container, false)

        btn_pwd = view.findViewById(R.id.btnpwd)

        btn_pwd.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_passwordFragment_to_otpFragment)
        }

        return view
    }


}