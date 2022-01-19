package com.hafizhmo.crudtodolistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hafizhmo.crudtodolistapp.ui.theme.CRUDTodoListAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CRUDTodoListAppTheme {

            }
        }
    }
}
