package com.bellicaspiritualis.todo_compose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.bellicaspiritualis.todo_compose.util.Action

@Composable
fun TaskScreen(
    navigationToListScreen: (Action) -> Unit
) {
    
    Scaffold(
        topBar = {
            TaskAppBar(
                navigateToListScreen = navigationToListScreen
            )
        },
        content = {}
    )
}