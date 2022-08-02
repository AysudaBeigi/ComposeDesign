package com.aysuda.uidesign.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.aysuda.uidesign.domain.Item
import com.aysuda.uidesign.domain.Test

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                TestScreen(
                    tests = listOf(
                        Test.CollapsedItem(
                            items = listOf(
                                Item(title = "", color = Color.Yellow),
                                Item(title = "", color = Color.Yellow)
                            )
                        ),
                        Test.ExpandedItem(item = Item(title = "", color = Color.Yellow)),
                        Test.CollapsedItem(
                            items = listOf(
                                Item(title = "", color = Color.Yellow),
                                Item(title = "", color = Color.Yellow)
                            )
                        ),
                        Test.ExpandedItem(item = Item(title = "", color = Color.Yellow)),
                    )
                )
            }
        }
    }
}