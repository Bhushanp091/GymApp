package com.example.gymapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gymapp.ui.theme.BlueColor
import com.example.gymapp.ui.theme.DarkGrey
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun ProgressBox(){
    Surface (
        modifier = Modifier
            .height(150.dp)
            .width(400.dp)
            .padding(vertical = 16.dp, horizontal = 8.dp),
        shape = RoundedCornerShape(16.dp),
        shadowElevation = 5.dp,
        color = DarkGrey

    ){
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column (
                modifier = Modifier.padding(8.dp)
            ){
                Text(text = "Workout Progress", textAlign = TextAlign.Center, color =  Color.LightGray)
                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "11 Exercise Left", textAlign = TextAlign.Center, fontSize = 16.sp, color = Color.DarkGray)
            }
            Box {
                Text(text = "jsdjg")
            }

        }
    }
}
