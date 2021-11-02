package com.bellicaspiritualis.todo_compose.navigation.destinations

import android.util.Log
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.bellicaspiritualis.todo_compose.ui.screens.task.TaskScreen
import com.bellicaspiritualis.todo_compose.ui.viewmodels.SharedViewModel
import com.bellicaspiritualis.todo_compose.util.Action
import com.bellicaspiritualis.todo_compose.util.Constants.TASK_ARGUMENT_KEY
import com.bellicaspiritualis.todo_compose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        sharedViewModel.getSelectedTasks(taskId = taskId)
        val selectedTask by sharedViewModel.selectedTask.collectAsState()
        
        TaskScreen(
            selectedTask = selectedTask,
            navigationToListScreen = navigateToListScreen
        )
    }
}