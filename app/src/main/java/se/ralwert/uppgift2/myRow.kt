package se.ralwert.uppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun myRow(item: Mylist, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.Center
    ) {
        Text(
            item.itemtitle
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ShopRowPreview() {
myRow(Mylist("X"))}