package com.aysuda.uidesign.domain

import androidx.compose.ui.graphics.Color

sealed class Test {
    data class CollapsedItem(
        val items: List<Item>
    ) : Test()

    data class ExpandedItem(
        val item: Item
    ) : Test()
}

data class Item(
    val title: String,
    val color: Color,
)
