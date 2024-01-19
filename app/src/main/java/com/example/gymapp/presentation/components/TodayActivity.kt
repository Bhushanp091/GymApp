package com.example.gymapp.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gymapp.ui.theme.DarkGrey
import com.example.gymapp.ui.theme.RedTheme

@Composable
fun TodaysActivity(){
    Surface (
        modifier = Modifier
            .height(250.dp)
            .width(300.dp)
            .padding( horizontal = 8.dp, vertical = 1.dp),
        shape = RoundedCornerShape(16.dp),
        shadowElevation = 5.dp,
        color = DarkGrey

        ){

    }
}

@Composable
fun StreakShower(){
    Surface (
        modifier = Modifier
            .height(250.dp)
            .width(100.dp)
            .padding(horizontal = 8.dp, vertical = 1.dp),
        shape = RoundedCornerShape(16.dp),
        shadowElevation = 5.dp,
        color = RedTheme
    ){

    }
}