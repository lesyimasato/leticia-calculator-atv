package com.fatec.calculadoraleticia.ui.utils

fun calculateResult(v1: String, v2: String, operator: String): String {
    val num1 = v1.toDoubleOrNull()
    val num2 = v2.toDoubleOrNull()

    if (num1 == null || num2 == null) return "Erro: valores inválidos"

    return when (operator) {
        "+" -> (num1 + num2).toString()
        "-" -> (num1 - num2).toString()
        "*" -> (num1 * num2).toString()
        "/" -> if (num2 != 0.0) (num1 / num2).toString() else "Erro: divisão por zero"
        else -> "Operação inválida"
    }
}
