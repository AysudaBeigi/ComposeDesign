package com.aysuda.uidesign.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowItem(
    modifier: Modifier = Modifier,
    titles: Pair<String, String>
) {
    Row {
        CardItem(title = titles.first)
        Spacer(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .background(Color(0xFFECECEC))
                .size(1.dp, 16.dp)
                .align(Alignment.CenterVertically)
        )
        CardItem(title = titles.second)
    }
}

@Composable
fun CardItem(
    modifier: Modifier = Modifier,
    title: String
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        backgroundColor = Color(0xFFECECEC),
        contentColor = Color(0xFFECECEC),
        modifier = Modifier
    ) {
        Column {
            Spacer(modifier.size(16.dp))
            Text(
                text = title,
                modifier = Modifier.fillMaxWidth().shadow(10.dp, RoundedCornerShape(10.dp))
            )
        }
    }
}
