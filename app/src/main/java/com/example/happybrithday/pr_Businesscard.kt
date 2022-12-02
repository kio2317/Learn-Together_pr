package com.example.happybrithday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.happybrithday.ui.theme.HappyBrithdayTheme

class pr_Businesscard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBrithdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    besinesscard()
                }
            }
        }
    }
}

@Composable
// 명함 앱
fun besinesscard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // image
        val image = painterResource(R.drawable.android_logo)
        Image(painter = image, contentDescription =null)


        Text(
            text = stringResource(R.string.FullName)
        )

        Text(
            text = stringResource(R.string.job)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    HappyBrithdayTheme {
        besinesscard()
    }
}