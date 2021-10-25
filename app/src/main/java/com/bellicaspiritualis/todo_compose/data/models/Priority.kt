package com.bellicaspiritualis.todo_compose.data.models

import androidx.compose.ui.graphics.Color
import com.bellicaspiritualis.todo_compose.ui.theme.HighPriorityColor
import com.bellicaspiritualis.todo_compose.ui.theme.LowPriorityColor
import com.bellicaspiritualis.todo_compose.ui.theme.MediumPriorityColor
import com.bellicaspiritualis.todo_compose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}