package com.bellicaspiritualis.todo_compose.ui.screens.list

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.bellicaspiritualis.todo_compose.data.models.ToDoTask

@Composable
fun ListContent() {
}

@Composable
fun TaskItem(
    todoTask: ToDoTask,
    navigateToTaskScreen: (taskId: Int) -> Unit
) {
    Surface() {

    }
}