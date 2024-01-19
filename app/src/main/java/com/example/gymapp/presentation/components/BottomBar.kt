package com.example.gymapp.presentation.components

import androidx.compose.material3.BottomAppBarDefaults.containerColor
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.gymapp.presentation.navigation.listofNavItems
import com.example.gymapp.ui.theme.DarkGrey
import com.example.gymapp.ui.theme.DarkTheme
import com.example.gymapp.ui.theme.RedTheme
import org.w3c.dom.Text

@Composable
fun Bottombar(navController: NavController) {


NavigationBar (
    contentColor = RedTheme,
    containerColor = DarkTheme,
    modifier = Modifier
){

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    
    listofNavItems.forEach{navItems ->
        NavigationBarItem(

            selected = currentDestination?.hierarchy?.any(){ it.route == navItems.route }==true,
            onClick = {
                      navController.navigate(navItems.route){
                          popUpTo(navController.graph.findStartDestination().id){
                              saveState = true
                          }
                          launchSingleTop = true
                          restoreState = true
                      }
                      },
            icon = { Icon(painter = painterResource(id = navItems.icon), contentDescription = navItems.label) },
            label = { Text(text = navItems.label)}

        )
    }
}

}