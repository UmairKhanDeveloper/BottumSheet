package com.example.bottumsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.PinDrop
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottumSheet2() {
    var Bottumsheet by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(onClick = { Bottumsheet = !Bottumsheet }) {
            Text(text = "BottumSheet", modifier = Modifier.align(Alignment.Bottom))

        }

    }

    if (Bottumsheet) {
        ModalBottomSheet(onDismissRequest = { Bottumsheet = false }) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(50.dp),

                ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),


                    ) {
                    Icon(imageVector = Icons.Default.Navigation, contentDescription = "")
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(text = "Navigation")


                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),


                    ) {
                    Icon(imageVector = Icons.Default.Map, contentDescription = "")
                    Spacer(modifier = Modifier.size(10.dp))

                    Text(text = "Map")


                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),


                    ) {
                    Icon(imageVector = Icons.Default.Cloud, contentDescription = "")
                    Spacer(modifier = Modifier.size(10.dp))

                    Text(text = "Altitude")


                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),


                    ) {
                    Icon(imageVector = Icons.Default.PinDrop, contentDescription = "")
                    Spacer(modifier = Modifier.size(10.dp))

                    Text(text = "PinCode")


                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),


                    ) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = "")
                    Spacer(modifier = Modifier.size(10.dp))

                    Text(text = "FaceBook")

                }
                Spacer(modifier = Modifier.size(20.dp))

            }

        }
    }


}