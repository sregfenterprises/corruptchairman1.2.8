package com.sregfenterprises.corruptchairman.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onTakeoverTeamClicked: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Title
        Text(
            text = "Home",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Placeholder for future: stats, money, club owned etc.
        Text(
            text = "Welcome to Corrupt Chairman!",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(48.dp))

        // Button to choose your takeover team
        Button(
            onClick = onTakeoverTeamClicked,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Choose Takeover Team")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // More features will go here later:
        // - Daily tasks
        // - Matches
        // - Money laundering system
        // - Chairman influence
        // - Bribery mechanics (lol)
    }
}
