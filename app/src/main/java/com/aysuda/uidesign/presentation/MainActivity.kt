package com.aysuda.uidesign.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import com.aysuda.uidesign.domain.Test

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
            TestScreen(items=listOf(Test(singleTitle = "2",pairTitles = Pair("0","1")),Test(singleTitle = "3",pairTitles = Pair("4","5")),))
            }
        }
    }
}