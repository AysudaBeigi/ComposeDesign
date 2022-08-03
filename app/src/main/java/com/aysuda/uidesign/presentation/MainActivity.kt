package com.aysuda.uidesign.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
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
                                Item(title = "zero", color = Color.Red),
                                Item(title = "one", color = Color.Blue.copy(green = .5f))
                            )
                        ),
                        Test.ExpandedItem(item = Item(title = "two", color = MaterialTheme.colors.primarySurface)),
                        Test.CollapsedItem(
                            items = listOf(
                                Item(title = "three", color = Color.Green),
                                Item(title = "four", color = Color.Yellow)
                            )
                        ),
                        Test.ExpandedItem(item = Item(title = "five", color = Color.Magenta)),
                    )
                )
            }
        }
    }
}