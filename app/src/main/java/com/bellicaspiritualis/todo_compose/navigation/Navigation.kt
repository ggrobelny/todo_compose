package com.bellicaspiritualis.todo_compose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.bellicaspiritualis.todo_compose.navigation.destinations.listComposable
import com.bellicaspiritualis.todo_compose.navigation.destinations.taskComposable
import com.bellicaspiritualis.todo_compose.ui.viewmodels.SharedViewModel
import com.bellicaspiritualis.todo_compose.util.Constants.LIST_SCREEN

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavigation (
    navController: NavHostController,
    sharedViewModel: SharedViewModel
){
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )

        taskComposable (
            navigateToListScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
    }
}