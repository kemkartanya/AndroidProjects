package com.example.todolisttutorial

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_item_table")
class TaskItem(
    @ColumnInfo(name = "codename") var codename: String,
    @ColumnInfo(name = "version") var version: String,
    @ColumnInfo(name = "apiLevel") var apiLevel: String,
    @PrimaryKey(autoGenerate = true) var id: Int? = 0
)
{

    private fun purple(context: Context) = ContextCompat.getColor(context, R.color.purple_500)
    private fun black(context: Context) = ContextCompat.getColor(context, R.color.black)

}