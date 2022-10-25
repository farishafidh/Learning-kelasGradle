package com.example.testapp;

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HelloDosen : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Surface(color = Color.Blue,
                    modifier = Modifier.fillMaxWidth())
                {
                    Text(text = "Hello Dosen!",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                        color = Color.Green)
                }
                Surface(color = Color.Green,
                    modifier = Modifier.fillMaxWidth())
                {
                    Text(text = "Hello Mahasiswa",
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        color = Color.Blue)
                }

            }

        }
    }
}
