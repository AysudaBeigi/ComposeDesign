package com.aysuda.uidesign.presentation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.verticalScroll
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
    items:List<Test>
) {
    LazyColumn(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(
                state = ScrollState(0),
            )
    ) {
        stickyHeader {
            Text(text = stringResource(R.string.header))
        }
        itemsIndexed(items) { index, item ->
            if(index%2==0){
                RowItem(modifier=Modifier,titles = item.pairTitles)
            }else{
               CardItem(modifier=Modifier,title =item.singleTitle)
            }
        }
    }
}


@Preview
@Composable
fun MessageDetailsPreview() {
}