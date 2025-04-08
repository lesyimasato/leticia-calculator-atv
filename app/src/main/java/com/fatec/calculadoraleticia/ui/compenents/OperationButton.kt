package com.fatec.calculadoraleticia.ui.compenents

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OperationButton(modifier: Modifier = Modifier, symbol: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.size(50.dp),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(symbol)
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun OperationButtonPreview() {
//    MaterialTheme {
//        OperationButton(
//            symbol = "+",
//            onClick = {}
//        )
//    }
//}
