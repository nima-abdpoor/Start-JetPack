package com.nima.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.ui.tooling.preview.Preview


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
    @Composable
    @Preview
    private fun Greeting() {
        Column {


            Text(
                    text = "Hello, World!",
                    style = TextStyle(color = Color.Blue),
                    fontSize = TextUnit(200L)
            )

            Text(
                    text = "Hello,second World!",
                    style = TextStyle(color = Color.Blue),
                    fontSize = TextUnit(200L)
            )

            Text(
                    text = "Hello,third World!",
                    style = TextStyle(color = Color.Blue),
                    fontSize = TextUnit(200L)
            )
            Row {
                Text(
                        text = "Hello,fourth World!",
                        style = TextStyle(color = Color.Blue),
                        fontSize = TextUnit(200L)
                )
                Text(
                        text = "Hello,fifth World!",
                        style = TextStyle(color = Color.Blue),
                        fontSize = TextUnit(200L)
                )
            }
        }

    }
}