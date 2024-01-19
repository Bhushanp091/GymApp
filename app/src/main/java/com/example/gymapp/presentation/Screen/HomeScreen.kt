package com.example.gymapp.presentation.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gymapp.presentation.components.Bottombar
import com.example.gymapp.presentation.components.ProgressBox
import com.example.gymapp.presentation.components.StreakShower
import com.example.gymapp.presentation.components.TodaysActivity
import com.example.gymapp.presentation.components.TopBarHome
import com.example.gymapp.ui.theme.DarkGrey
import com.example.gymapp.ui.theme.DarkTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()


    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { TopBarHome(scrollBehavior)},
        containerColor = DarkTheme

    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {
            item {
                ProgressBox()
                Spacer(modifier = Modifier.padding(8.dp))
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Today's Progress",
                        modifier = Modifier.padding(horizontal = 8.dp),
                        fontWeight = FontWeight.ExtraBold
                    )
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Outlined.Edit,
                            contentDescription = "Edit",
                            tint = DarkGrey,
                        )
                    }
                }

                Row {
                    StreakShower()
                    TodaysActivity()
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Text(
                    text = "Overall Status",
                    modifier = Modifier.padding(horizontal = 8.dp),
                    fontWeight = FontWeight.ExtraBold
                )

                ProgressBox()
                ProgressBox()
                ProgressBox()
                ProgressBox()
                ProgressBox()
                ProgressBox()
            }
        }

    }
}

