package com.example.week2assgn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class OtpFragment : Fragment() {

    private lateinit var btn_otp: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Toast.makeText(activity , "First enter your OTP", Toast.LENGTH_SHORT).show()
            }
        }


        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_otp, container, false)

        btn_otp = view.findViewById(R.id.btnvalidate)

        btn_otp.setOnClickListener {
            val currect_otp = "1234"
            val current_otp = view.findViewById<EditText>(R.id.editTextOtp).text.toString()

            if(currect_otp != current_otp) {
                Navigation.findNavController(view)
                    .navigate(R.id.action_otpFragment_to_loginFragment)
            } else {
                val tV = view.findViewById<TextView>(R.id.textView5)
                tV.text = "OTP Sent Successfully"
                tV.visibility = View.VISIBLE
            }
        }

       return view
    }

}