package com.example.bottumsheet

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Backup
import androidx.compose.material.icons.filled.InsertDriveFile
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.OfflinePin
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Update
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavigationDrawer2() {
    val DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(drawerState = DrawerState, drawerContent = {
        ModalDrawerSheet {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.pic),
                        contentDescription = "",
                        modifier = Modifier.size(70.dp),
                        contentScale = ContentScale.Crop
                    )

                }
                Spacer(modifier = Modifier.size(10.dp))

                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Umair Khan",
                            modifier = Modifier,
                            style = TextStyle(fontWeight = FontWeight.W900, fontSize = 20.sp)
                        )
                        Spacer(modifier = Modifier.size(5.dp))
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Text(text = "uk236393@gmail.com")
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "",
                                modifier = Modifier.padding(start = 100.dp)
                            )

                        }


                    }


                }
                Spacer(modifier = Modifier.size(25.dp))
                HorizontalDivider()
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.InsertDriveFile, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "My File", style = TextStyle(fontSize = 20.sp))

                }
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.People, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "Shera with me", style = TextStyle(fontSize = 20.sp))

                }
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "Starred", style = TextStyle(fontSize = 20.sp))

                }
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.Update, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "Recent", style = TextStyle(fontSize = 20.sp))

                }
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.OfflinePin, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "Offline", style = TextStyle(fontSize = 20.sp))

                }
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.Upload, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "Uploads", style = TextStyle(fontSize = 20.sp))

                }
                Spacer(modifier = Modifier.size(30.dp))
                Row() {
                    Icon(imageVector = Icons.Default.Backup, contentDescription = "")
                    Spacer(modifier = Modifier.size(30.dp))
                    Text(text = "Backups", style = TextStyle(fontSize = 20.sp))

                }

            }

        }
    }) {
        Scaffold(topBar = {
            TopAppBar(title = { Text(text = "NavigationDrawer") }, navigationIcon = {
                Icon(imageVector = Icons.Default.Menu,
                    contentDescription = "",
                    modifier = Modifier.clickable {
                        scope.launch {
                            DrawerState.open()
                        }
                    })
            })
        }) {

        }

    }


}