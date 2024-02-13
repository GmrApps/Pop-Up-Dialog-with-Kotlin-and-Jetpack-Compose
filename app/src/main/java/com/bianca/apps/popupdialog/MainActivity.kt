package com.bianca.apps.popupdialog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bianca.apps.popupdialog.ui.theme.PopUpDialogTheme
import com.bianca.apps.popupdialog.uiScreens.DisplayOne


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PopUpDialogTheme {
                DisplayOne()

            }
        }
    }
}

