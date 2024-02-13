package com.bianca.apps.popupdialog.uiScreens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.bianca.apps.popupdialog.uiElements.AlertDialog

@Composable
fun DisplayOne() {

    var showDialog by remember { mutableStateOf(false) }

    if (showDialog){
      AlertDialog(onDismiss = {showDialog=false})
    }


    Surface(modifier = Modifier.fillMaxSize()) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()){

            Button(onClick = { showDialog=true }) {
                Text(text = "Privacy policy")

            }

        }

    }

}