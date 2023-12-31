package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyProgresBarAdvance() {
    var progessStatus by rememberSaveable {
        mutableStateOf(0f)
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(progress = progessStatus)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(onClick = {
                if (progessStatus < 1f) {
                    progessStatus += 0.1f
                }
            }, Modifier.padding(20.dp)) {
                Text(text = "Incrementar")
            }
            Button(onClick = {
                if (progessStatus > 0.1) {
                    progessStatus -= 0.1f
                }
            }, Modifier.padding(20.dp)) {
                Text(text = "Reducir")
            }
        }

    }
}

@Composable
fun MyProgresBar() {
    var showLoading by rememberSaveable {
        mutableStateOf(false)
    }
    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(
                Modifier.padding(top = 32.dp), color = Color.Red, backgroundColor = Color.Green
            )
        }
        Button(onClick = { showLoading = !showLoading }, Modifier.padding(top = 20.dp)) {
            Text(text = "Cargando Perfil")
        }
    }
}