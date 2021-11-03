package com.bellicaspiritualis.todo_compose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.bellicaspiritualis.todo_compose.data.models.Priority
import com.bellicaspiritualis.todo_compose.data.models.ToDoTask
import com.bellicaspiritualis.todo_compose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    navigationToListScreen: (Action) -> Unit
) {
    
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigationToListScreen
            )
        },
        content = {
            TaskContent(
                title = "",
                onTitleChange = {},
                description = "",
                onDescriptionChange = {},
                priority = Priority.LOW,
                onPrioritySelected = {}
            )
        }
    )
}