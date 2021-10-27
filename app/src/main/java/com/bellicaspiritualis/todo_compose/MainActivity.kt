package com.bellicaspiritualis.todo_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bellicaspiritualis.todo_compose.navigation.SetupNavigation
import com.bellicaspiritualis.todo_compose.ui.theme.Todo_composeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Todo_composeTheme {
                navController = rememberNavController()
                SetupNavigation(navController = navController)
            }
        }
    }
}
