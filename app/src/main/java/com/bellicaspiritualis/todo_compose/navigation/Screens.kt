package com.bellicaspiritualis.todo_compose.navigation

import androidx.navigation.NavHostController
import com.bellicaspiritualis.todo_compose.util.Action
import com.bellicaspiritualis.todo_compose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list:(Action) -> Unit = { action ->
        navController.navigate(route= "list/${action.name}") {
            popUpTo(LIST_SCREEN) {inclusive = true}
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}