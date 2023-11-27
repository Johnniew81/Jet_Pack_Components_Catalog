package com.example.jetpackcomponentscatalog

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//Componente card
@Composable
fun MyCard() {
    Column(Modifier.fillMaxSize()) {
        Card(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)

        ) {
            Column(Modifier.padding(16.dp)) {
                Text(text = "Ejemplo 1")
                Text(text = "Ejemplo 2")
                Text(text = "Ejemplo 3")
            }

        }
    }
}

@Composable
fun MyDivider() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text(text = "Mi texto", Modifier.padding(bottom = 10.dp))
        Divider(Modifier.fillMaxWidth())
        Text(text = "Mi texto 2", Modifier.padding(top = 10.dp))
    }
}

//Componente BadgeBox
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBadgedBox() {
    BadgedBox(
        modifier = Modifier.padding(16.dp),
        badge = {
            Badge(
                content = { Text("100") },
                containerColor = Color.Blue,
                contentColor = Color.Green
            )
        }) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "Estrella")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDropDownMenu() {

    var selectedText by rememberSaveable {
        mutableStateOf("")
    }
    var expanded by rememberSaveable {
        mutableStateOf(false)
    }
    val desserts = listOf("Helado", "Chocolate","Café", "Fruta", "Natillas", "Suso")
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = { selectedText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth()
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            desserts.forEach { dessert-> DropdownMenuItem(
                text = { dessert },
                onClick = {
                    expanded=false
                    selectedText = dessert
                },
                colors = MenuDefaults.itemColors(Color.Red))}
        }
    }
}