package com.fatec.calculadoraleticia.ui.compenents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HistoryCard(modifier: Modifier = Modifier, text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(8.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun HistoryCardPreview() {
//    MaterialTheme {
//        HistoryCard(
//            text = "10 + 5 = 15"
//        )
//    }
//}