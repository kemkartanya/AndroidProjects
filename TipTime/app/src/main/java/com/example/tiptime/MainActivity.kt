package com.example.tiptime

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calBtn = findViewById<Button>(R.id.calculate_button)
        calBtn.setOnClickListener {
            calculateTip()
        }

        val temp = findViewById<EditText>(R.id.cost_of_service_edit_text)
        temp.setOnKeyListener {
            view, keyCode, _ -> handleKeyEvent(view, keyCode)
        }
    }

    private fun calculateTip() {
        val stringInTextField = findViewById<TextInputEditText>(R.id.cost_of_service_edit_text).text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if(cost == null) {
            findViewById<TextView>(R.id.tip_result).text = ""
            return
        }
        val radioGroup = findViewById<RadioGroup>(R.id.tip_options)
        val tipPercentage = when (radioGroup.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        val roundUp = findViewById<Switch>(R.id.round_up_switch).isChecked
        if(roundUp) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        findViewById<TextView>(R.id.tip_result).text = getString(R.string.tip_amount, formattedTip)
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}