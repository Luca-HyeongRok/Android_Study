package com.luca.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luca.myapplication.presentation.component.BigButton
import com.luca.myapplication.presentation.component.InputField
import com.luca.myapplication.presentation.component.MediumButton
import com.luca.myapplication.presentation.component.SmallButton
import com.luca.myapplication.presentation.component.Tabs
import com.luca.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .padding(16.dp)
                    ) {
                        BigButton("Button")
                        Spacer(modifier = Modifier.height(16.dp))

                        MediumButton("Button")
                        Spacer(modifier = Modifier.height(16.dp))

                        SmallButton("Button")
                        Spacer(modifier = Modifier.height(16.dp))

                        InputField("Label", "")
                        Spacer(modifier = Modifier.height(16.dp))

                        InputField("Label", "")
                        Spacer(modifier = Modifier.height(16.dp))

                        InputField("Label", "placeholder")

                        Spacer(modifier = Modifier.height(16.dp))

                        Tabs(
                            labels = listOf("Label", "Label"),
                            selectedIndex = 1,
                            onValueChange = {},
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Tabs(
                            labels = listOf("Label", "Label"),
                            selectedIndex = 0,
                            onValueChange = {},
                        )
                    }
                }
            }
        }
    }
}
