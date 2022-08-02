package com.aysuda.uidesign.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardItem(
    modifier: Modifier = Modifier,
    title: String,
    color: Color
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        backgroundColor = color,
        contentColor = color,
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
