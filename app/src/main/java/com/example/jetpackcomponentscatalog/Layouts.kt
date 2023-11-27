package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun Mybox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Blue)
                .verticalScroll(rememberScrollState())
        )
        {
            Text(text = "Este texto es de prueba")
        }
    }
}

@Composable
fun MyColumn() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text(text = "Ejemplo 1", Modifier.background(Color.Red))
        Text(text = "Ejemplo 2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo 3", Modifier.background(Color.Green))
        Text(text = "Ejemplo 4", Modifier.background(Color.Yellow))
    }
}

@Composable
fun MyRow() {
    Row(Modifier.fillMaxSize()) {
        Text(text = "Ejemplo 1", Modifier.background(Color.Red))
        Text(text = "Ejemplo 2", Modifier.background(Color.Blue))
        Text(text = "Ejemplo 3", Modifier.background(Color.Green))
        Text(text = "Ejemplo 4", Modifier.background(Color.Yellow))
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan)
        )
        MySpacer(size = 30)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Yellow)
                    .fillMaxHeight()
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Blue)
                    .fillMaxHeight(), contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola soy yo")
            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Green)
        )
    }
}

@Composable
fun MySpacer(size:Int){
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun MyEjecicio1() {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Yellow)
                    .fillMaxHeight(), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Blue)
                    .fillMaxHeight(), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Green), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun MyConstrainExample1(){
    ConstraintLayout {
        Box(modifier = Modifier.size(125.dp))
    }
}