package com.aysuda.uidesign.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.aysuda.uidesign.domain.Test
import com.aysuda.uidesign.domain.TestType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                TestScreen(
                    tests = listOf(
                        Test("zero", TestType.collapsed, color = Color.Red),
                        Test("one", TestType.collapsed, color = Color.Blue),
                        Test("two", TestType.collapsed, color = Color.Black),
                        Test("three", TestType.collapsed, color = Color.Green),
                        Test("four", TestType.collapsed, color = Color.Yellow),
                        Test("five", TestType.collapsed, color = Color.Magenta),
                    )
                )
            }
        }
    }
}