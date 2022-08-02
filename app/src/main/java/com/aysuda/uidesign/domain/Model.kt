package com.aysuda.uidesign.domain

import androidx.compose.ui.graphics.Color

data class Test(
    val title: String,
    val type: TestType,
    val color: Color
)

enum class TestType {
    collapsed, expand
}
