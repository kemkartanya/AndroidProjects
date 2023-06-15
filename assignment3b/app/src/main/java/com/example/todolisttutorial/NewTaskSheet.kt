package com.example.todolisttutorial

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.todolisttutorial.databinding.FragmentNewTaskSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.time.LocalTime

class NewTaskSheet(var taskItem: TaskItem?) : BottomSheetDialogFragment()
{
    private lateinit var binding: FragmentNewTaskSheetBinding
    private lateinit var taskViewModel: TaskViewModel
    private var dueTime: LocalTime? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()

        if (taskItem != null)
        {
            binding.taskTitle.text = "Add New Android Flavour"
            val editable = Editable.Factory.getInstance()
            binding.codename.text = editable.newEditable(taskItem!!.codename)
            binding.version.text = editable.newEditable(taskItem!!.version)
            binding.apiLevel.text = editable.newEditable(taskItem!!.apiLevel)
        }
        else
        {
            binding.taskTitle.text = "New Android Flavour"
        }

        taskViewModel = ViewModelProvider(activity).get(TaskViewModel::class.java)
        binding.saveButton.setOnClickListener {
            saveAction()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewTaskSheetBinding.inflate(inflater,container,false)
        return binding.root
    }


    private fun saveAction()
    {
        val codename = binding.codename.text.toString()
        val version = binding.version.text.toString()
        val apiLevel = binding.apiLevel.text.toString()
        if(taskItem == null)
        {
            val newTask = TaskItem(codename,version, apiLevel,null)
            taskViewModel.addTaskItem(newTask)
        }
        else
        {
            taskItem!!.codename = codename
            taskItem!!.version = version
            taskItem!!.apiLevel = apiLevel

            taskViewModel.updateTaskItem(taskItem!!)
        }
        binding.codename.setText("")
        binding.version.setText("")
        binding.apiLevel.setText("")
        dismiss()
    }

}








