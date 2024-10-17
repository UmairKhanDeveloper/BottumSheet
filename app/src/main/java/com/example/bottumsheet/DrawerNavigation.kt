package com.example.bottumsheet

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DrawerNavigation() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()


    ModalNavigationDrawer(drawerState = drawerState, drawerContent = {
        ModalDrawerSheet {
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
            Text(text = "Hello World")
        }
    }) {
        Scaffold(topBar = {
            TopAppBar(title = { Text(text = "DrawerNavigation") }, navigationIcon = {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "",
                    modifier = Modifier.clickable {
                       scope.launch {
                                drawerState.open()
                       }

                    })
            })
        }) {

        }
    }

}