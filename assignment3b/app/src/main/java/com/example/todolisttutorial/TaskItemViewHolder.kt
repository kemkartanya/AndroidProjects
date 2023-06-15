package com.example.todolisttutorial

import android.content.Context
import android.graphics.Paint
import androidx.recyclerview.widget.RecyclerView
import com.example.todolisttutorial.databinding.TaskItemCellBinding
import java.time.format.DateTimeFormatter

class TaskItemViewHolder(
    private val context: Context,
    private val binding: TaskItemCellBinding,
    private val clickListener: TaskItemClickListener
): RecyclerView.ViewHolder(binding.root)
{
    private val timeFormat = DateTimeFormatter.ofPattern("HH:mm")

    fun bindTaskItem(taskItem: TaskItem)
    {
        binding.codename.text = taskItem.codename
        binding.version.text = taskItem.version
        binding.apiLevel.text = taskItem.apiLevel

        binding.taskCellContainer.setOnClickListener{
            clickListener.editTaskItem(taskItem)
        }

    }
}