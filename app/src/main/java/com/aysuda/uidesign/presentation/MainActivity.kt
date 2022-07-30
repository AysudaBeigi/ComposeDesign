package com.aysuda.uidesign.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.aysuda.uidesign.domain.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestScreen(items=listOf(Test(singleTitle = "2",pairTitles = Pair("0","1"))))
        }
    }
}