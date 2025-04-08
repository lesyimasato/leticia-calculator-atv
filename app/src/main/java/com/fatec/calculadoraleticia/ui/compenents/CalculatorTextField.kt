package com.fatec.calculadoraleticia.ui.compenents

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    Column {
        OutlinedTextField(
            value = value,
            onValueChange = {
                if (it.count { char -> char == '.' } <= 1) {
                    onValueChange(it)
                }
            },
            label = { Text(label, style = MaterialTheme.typography.labelMedium) },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun CalculatorTextFieldPreview() {
//    val (value, setValue) = remember { mutableStateOf("") }
//    MaterialTheme {
//        CalculatorTextField(
//            label = "Digite um número:",
//            value = value,
//            onValueChange = setValue
//        )
//    }
//}
