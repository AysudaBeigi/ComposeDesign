package com.aysuda.uidesign.presentation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aysuda.uidesign.R
import com.aysuda.uidesign.domain.Test

@OptIn(
    ExperimentalAnimationApi::class,
    androidx.compose.foundation.ExperimentalFoundationApi::class
)
@Composable
fun TestScreen(
    modifier: Modifier = Modifier,
    tests: List<Test>
) {
    BoxWithConstraints {
        Box(
            modifier = modifier
                .padding(16.dp)
                .fillMaxSize()
        ) {
            LazyColumn() {
                stickyHeader {
                    Text(
                        text = stringResource(R.string.header),
                        fontSize = 24.sp,
                        color = Color.Blue
                    )
                }
                items(tests) { test ->

                    when (test) {
                        is Test.CollapsedItem -> {
                            CollapsedItem(test)
                            Spacer(modifier = Modifier.size(16.dp))
                        }
                        is Test.ExpandedItem -> {
                            ExpandedItem(
                                modifier = Modifier,
                                title = test.item.title,
                                test.item.color
                            )
                            Spacer(modifier = Modifier.size(16.dp))
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun MessageDetailsPreview() {
}