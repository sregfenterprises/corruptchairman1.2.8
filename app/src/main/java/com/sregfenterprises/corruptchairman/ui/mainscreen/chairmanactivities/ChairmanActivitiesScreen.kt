package com.sregfenterprises.corruptchairman.ui.mainscreen.chairmanactivities

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ChairmanActivitiesScreen(
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
            text = "Chairman Activities",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        // ✅ Chairman Profile
        Button(
            onClick = onProfileClicked,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) {
            Text("Chairman Profile")
        }

        // Add other activity buttons here if needed
        // Button(onClick = onBusinessActivities, ...) { Text("Business Activities") }

        Spacer(modifier = Modifier.height(24.dp))

        // 🔙 Back button
        Button(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) {
            Text("Back")
        }
    }
}
