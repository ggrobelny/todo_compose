package com.bellicaspiritualis.todo_compose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bellicaspiritualis.todo_compose.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)