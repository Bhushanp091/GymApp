package com.example.gymapp.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.gymapp.ui.theme.DarkGrey
import com.example.gymapp.ui.theme.DarkTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarHome(scrollBehavior: TopAppBarScrollBehavior) {
    TopAppBar(
        title = { Column(
        ) {
            Text(text = "Hello Bhushan!!", color = Color.LightGray)
        } },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Outlined.Menu, contentDescription ="Menu" )
        } },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Notifications, contentDescription ="Notifications" )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = DarkTheme),
        scrollBehavior = scrollBehavior,
    )
        
}

