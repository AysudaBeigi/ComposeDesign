package com.aysuda.uidesign.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.aysuda.uidesign.domain.Test

@Composable
fun Item(
    modifier: Modifier = Modifier,
    title: String,
    color: Color
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = color,
        contentColor = color,
    ) {
        Box(modifier = Modifier) {
            Text(
                text = title,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .height(48.dp)
                    .background(color = Color.Gray.copy(alpha = 0.5f))
                    .align(Alignment.BottomCenter),
                color = Color.White, textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun CollapsedItems(test: Test.CollapsedItem) {
    Row {
        Item(
            modifier = Modifier.weight(1f).height(150.dp),
            title = test.items[0].title,
            test.items[0].color
        )
        Spacer(modifier = Modifier.size(16.dp))
        Item(
            modifier = Modifier.weight(1f).height(150.dp),
            title = test.items[1].title,
            test.items[1].color
        )
    }
}
