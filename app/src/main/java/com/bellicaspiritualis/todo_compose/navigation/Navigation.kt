package com.bellicaspiritualis.todo_compose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.bellicaspiritualis.todo_compose.navigation.destinations.listComposable
import com.bellicaspiritualis.todo_compose.navigation.destinations.splashComposable
import com.bellicaspiritualis.todo_compose.navigation.destinations.taskComposable
import com.bellicaspiritualis.todo_compose.ui.viewmodels.SharedViewModel
import com.bellicaspiritualis.todo_compose.util.Constants.SPLASH_SCREEN
import com.google.accompanist.navigation.animation.AnimatedNavHost

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

    AnimatedNavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )

        taskComposable (
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }
}