package com.bellicaspiritualis.todo_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.bellicaspiritualis.todo_compose.navigation.destinations.listComposable
import com.bellicaspiritualis.todo_compose.navigation.destinations.taskComposable
import com.bellicaspiritualis.todo_compose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation (
    navController: NavHostController
){
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )

        taskComposable (
            navigateToListScreen = screen.list
        )
    }
}