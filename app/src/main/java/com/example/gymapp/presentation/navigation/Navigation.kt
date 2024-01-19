package com.example.gymapp.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.presentation.Screen.HomeScreen
import com.example.gymapp.presentation.Screen.AccoundScreen
import com.example.gymapp.presentation.Screen.DiscoveryScreen
import com.example.gymapp.presentation.Screen.ReportScreen
import com.example.gymapp.presentation.Screen.Screens
import com.example.gymapp.presentation.components.Bottombar

@Composable
fun Navigation(){
    val navController = rememberNavController()
    Scaffold (
        bottomBar = { Bottombar(navController = navController)}
    ) {paddingValue->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValue)
        ) {
            composable(Screens.HomeScreen.name) {
                HomeScreen(navController)
            }
            composable(Screens.DiscoverScreen.name) {
                DiscoveryScreen()
            }
            composable(Screens.ReportScreen.name) {
                ReportScreen()
            }
            composable(Screens.AccountScreen.name) {
                AccoundScreen()
            }
        }
    }
}
