package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonExample() {
    var enabled by rememberSaveable { mutableStateOf(true) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enabled = false }, enabled = enabled, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow, contentColor = Color.Blue
            ), border = BorderStroke(5.dp, Color.Blue)
        ) {
            Text(text = "Hola")
        }
        OutlinedButton(
            onClick = { enabled = false },
            Modifier.padding(top = 8.dp),
            colors = androidx.compose.material.ButtonDefaults.buttonColors(
                backgroundColor = Color.Red, contentColor = Color.Green
            )
        ) {
            Text(text = "Otro boton")
        }
        TextButton(onClick = { enabled = false }) {
            Text(text = "Pulsa")
        }
    }
}