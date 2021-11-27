package com.bellicaspiritualis.todo_compose.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.bellicaspiritualis.todo_compose.R
import com.bellicaspiritualis.todo_compose.ui.theme.LOGO_HEIGHT
import com.bellicaspiritualis.todo_compose.ui.theme.splashScreenBackground
import com.bellicaspiritualis.todo_compose.util.Constants.SPLASH_SCREEN_DELAY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToListScreen:() -> Unit,
) {
    LaunchedEffect(key1 = true ) {
        delay(SPLASH_SCREEN_DELAY)
        navigateToListScreen()
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.splashScreenBackground),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(LOGO_HEIGHT),
            painter = painterResource(id = getLogo()),
            contentDescription = stringResource(id = R.string.todo_logo))
    }
}

@Composable
fun getLogo(): Int {
    return if (isSystemInDarkTheme()) {
        R.drawable.ic_checklist
    } else {
        R.drawable.ic_checklist
    }
}

@Composable
@Preview
private fun SplashScreenPreview() {
    SplashScreen(
        navigateToListScreen = {}
    )
}