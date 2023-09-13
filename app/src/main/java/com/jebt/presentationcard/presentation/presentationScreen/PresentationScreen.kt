package com.jebt.presentationcard.presentation.presentationScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jebt.presentationcard.R
import com.jebt.presentationcard.data.PresentationData
import com.jebt.presentationcard.ui.theme.AndroidGreen

@Composable
fun PresentationScreen() {
    Column {
        Top(modifier = Modifier.weight(4f))
        Bottom(modifier = Modifier.weight(1f))
    }
}

@Composable
fun Top(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(120.dp),
            imageVector = Icons.Default.Android,
            contentDescription = "",
            tint = AndroidGreen
        )
        Text(
            text = PresentationData.name,
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = PresentationData.description,
            color = AndroidGreen,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun Bottom(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Column() {
            Row(modifier = Modifier.padding(8.dp)) {
                Icon(
                    modifier = Modifier.size(32.dp),
                    imageVector = Icons.Default.Phone,
                    contentDescription = "",
                    tint = AndroidGreen
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = PresentationData.phone)
            }
            Row(modifier = Modifier.padding(8.dp)) {
                Icon(
                    modifier = Modifier.size(32.dp),
                    imageVector = Icons.Default.Mail,
                    contentDescription = "",
                    tint = AndroidGreen
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = PresentationData.email)
            }
            Row(modifier = Modifier.padding(8.dp)) {
                Icon(
                    modifier = Modifier.size(32.dp),
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "",
                    tint = AndroidGreen
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = PresentationData.localtion)
            }
        }
    }
}