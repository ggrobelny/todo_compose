package com.bellicaspiritualis.todo_compose.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.bellicaspiritualis.todo_compose.ui.screens.list.ListScreen
import com.bellicaspiritualis.todo_compose.ui.viewmodels.SharedViewModel
import com.bellicaspiritualis.todo_compose.util.Constants.LIST_ARGUMENT_KEY
import com.bellicaspiritualis.todo_compose.util.Constants.LIST_SCREEN
import com.bellicaspiritualis.todo_compose.util.toAction

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
        navigateToTaskScreen: (Int) -> Unit,
        sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) { navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        
        LaunchedEffect(key1 = action) {
            sharedViewModel.action.value = action
        }
        
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}