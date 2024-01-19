package com.example.gymapp.presentation.navigation

import android.graphics.Paint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.gymapp.R
import com.example.gymapp.presentation.Screen.Screens

data class NavItems(
    val label:String,
    val icon: Int,
    val route:String
)
val listofNavItems = listOf(
    NavItems(
        label = "Home",
        icon = R.drawable.baseline_home_filled_24,
        route = Screens.HomeScreen.name
    ) ,
    NavItems(
        label = "Discover",
        icon = R.drawable.baseline_new_releases_24,
        route = Screens.DiscoverScreen.name
    ),
    NavItems(
        label = "Report",
        icon = R.drawable.baseline_bar_chart_24,
        route = Screens.ReportScreen.name
    )  ,
    NavItems(
        label = "Setting",
        icon = R.drawable.baseline_settings_24,
        route = Screens.AccountScreen.name
    )
)