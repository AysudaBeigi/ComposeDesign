package com.aysuda.uidesign.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.aysuda.uidesign.domain.Test

@Composable
fun CardItem(
    modifier: Modifier,
    title: String,
    color: Color
) {
    Card(
        modifier = modifier.height(200.dp),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = color,
        contentColor = color,
    ) {
        Column() {
            Spacer(modifier.size(16.dp))
            Text(
                text = title,
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(10.dp, RoundedCornerShape(10.dp))
            )
        }
    }
}

@Composable
fun ExpandedItem(
    modifier: Modifier = Modifier,
    title: String,
    color: Color
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = color,
        contentColor = color,
    ) {
        Column {
            Spacer(modifier.size(16.dp))
            Text(
                text = title,
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(10.dp, RoundedCornerShape(10.dp))
            )
        }
    }
}

@Composable
fun CollapsedItem(test: Test.CollapsedItem) {
    Row {
        CardItem(
            modifier = Modifier.weight(1f),
            title = test.items[0].title,
            test.items[0].color
        )
        Spacer(modifier = Modifier.size(16.dp))
        CardItem(
            modifier = Modifier.weight(1f),
            title = test.items[1].title,
            test.items[1].color
        )
    }
}
