package me.tanyakemkar.dialogueassgn

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import me.tanyakemkar.dialogueassgn.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // exit
        binding.btn4.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you Sure?")
            builder1.setMessage("Do you want to close the App?")
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when Yes is clicked ?
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when No is clicked ?
            })
            builder1.show()
        }

        // ques 1
        binding.btn1.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmalai", "Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option ?
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when No is clicked ?
            })
            builder2.show()
        }

        // ques 2
        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmalai", "Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when No is clicked ?
            })
            builder2.show()
        }

        // ques 3
        binding.btn3.setOnClickListener {
            val options = arrayOf("Gulab Jamun", "Rasmalai", "Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any option ?
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when Yes is clicked ?
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->
                // what action should be performed when No is clicked ?
            })
            builder2.show()
        }

        
    }
}