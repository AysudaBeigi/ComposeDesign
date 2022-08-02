package com.aysuda.uidesign.presentation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    Text(text = stringResource(R.string.header))
                }
                items(tests) { test ->

                    when (test) {
                        is Test.CollapsedItem -> {
                            RowItem(test)
                        }
                        is Test.ExpandedItem -> {
                            CardItem(
                                modifier = Modifier,
                                title = test.item.title,
                                test.item.color
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun RowItem(test: Test.CollapsedItem) {
    Row {
        CardItem(
            modifier = Modifier,
            title = test.items[0].title,
            test.items[0].color
        )
        Spacer(modifier = Modifier.weight(1f))
        CardItem(
            modifier = Modifier,
            title = test.items[1].title,
            test.items[1].color
        )
    }
}

@Preview
@Composable
fun MessageDetailsPreview() {
}