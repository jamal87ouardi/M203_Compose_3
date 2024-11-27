package com.example.m203_compose_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.m203_compose_3.ui.theme.M203_Compose_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            M203_Compose_3Theme {
                AppContent()
            }
        }
    }
}




@Composable
fun AppContent() {
    // États pour les TextField et les RadioButton
    var name by remember { mutableStateOf("") }
    var nuite by remember { mutableStateOf("") }
    var roomType by remember { mutableStateOf("") }
    var resultMessage by remember { mutableStateOf("") }

    // Interface utilisateur
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()

    )
    {
        Spacer(modifier = Modifier.height(100.dp))
        // Premier TextField
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nom") }
        )

        // Deuxième TextField
        TextField(
            value = nuite,
            onValueChange = { nuite = it },
            label = { Text("Nuité") }
        )

        // RadioButtons avec labels
        Row {
            RadioButton(
                selected = roomType == "Simple",
                onClick = { roomType = "Simple" }
            )
            Text("Simple")
        }

        Row {
            RadioButton(
                selected = roomType == "Double",
                onClick = { roomType = "Double" }
            )
            Text("Double")
        }

        Row {
            RadioButton(
                selected = roomType == "Multiple",
                onClick = { roomType = "Multiple" }
            )
            Text("Multiple")
        }

        // Bouton
        Button(onClick = {

        }) {
            Text("Valider")
        }

        // Texte affichant le résultat
        Text("Prix Total")
    }
}