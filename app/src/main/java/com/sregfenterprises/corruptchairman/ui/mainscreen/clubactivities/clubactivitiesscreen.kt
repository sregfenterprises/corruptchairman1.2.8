package com.sregfenterprises.corruptchairman.ui.mainscreen.clubactivities



import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun clubactivitiesscreen(
    onBack: () -> Unit,
    onProfileClicked: () -> Unit,
    onBusinessActivities: () -> Unit = {},
    onSquad: () -> Unit = {},
    onBackroomStaff: () -> Unit = {},
    onStadium: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top
    ) {

        // Screen Title
        Text(
            text = "Club Activities",
            style = MaterialTheme.typography.headlineMedium
        )

        Button(
            onClick = { /* TODO: Squad */ },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) { Text("Squad") }

        Button(
            onClick = { /* TODO: Backroom Staff */ },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) { Text("Backroom Staff") }

        Button(
            onClick = { /* TODO: Fixtues */ },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) { Text("Fixtures") }

        Button(
            onClick = { /* TODO: League Tables */ },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) { Text("League Tables") }

        Button(
            onClick = { /* TODO: Training */ },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) { Text("Training") }


        Button(
            onClick = { /* TODO: Stadium */ },
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) { Text("Stadium") }

        // 🔙 Back button
        Button(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) {
            Text("Back")
        }


    }}




