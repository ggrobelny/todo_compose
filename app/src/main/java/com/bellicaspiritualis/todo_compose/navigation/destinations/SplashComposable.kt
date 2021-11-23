package com.bellicaspiritualis.todo_compose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.bellicaspiritualis.todo_compose.ui.screens.splash.SplashScreen
import com.bellicaspiritualis.todo_compose.util.Constants.SPLASH_SCREEN


fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = SPLASH_SCREEN,
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}