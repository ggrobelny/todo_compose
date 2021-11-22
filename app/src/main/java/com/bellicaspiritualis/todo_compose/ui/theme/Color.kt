package com.bellicaspiritualis.todo_compose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


val Purple200 = Color(0xFFA17E41)
val Purple500 = Color(0xFFA17E41)
val Purple700 = Color(0xFFA17E41)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)
val Zloty = Color(0xFFA17E41)
val Malina = Color(0xFFA02146)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0xFFF7336C)
val NonePriorityColor = Color(0xFF7C7C7C)

val Colors.taskItemTextColor: Color
    @Composable
    get() = if(isLight) DarkGray else LightGray

val Colors.taskItemBackgroundColor: Color
    @Composable
    get() = if(isLight) Color.White else DarkGray

val Colors.fabBackgroundColor: Color
    @Composable
    get() = if(isLight) Malina else Malina

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if(isLight) Color.White else Zloty

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if(isLight) Zloty else Color.Black