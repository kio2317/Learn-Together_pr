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
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybrithday.ui.theme.HappyBrithdayTheme



class Pr_Task_Manager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBrithdayTheme {
                // A surface container using the 'background' color from the theme
                Surface( color = MaterialTheme.colors.background)
                {
                    CheckImageResource(All, Nice )
                }
            }
        }
    }
}

var All =  "All tasks completed"
var Nice = " Nice Work!"



@Composable
fun TextGreeting(All: String, Nice: String) {
    Column( ) {

            Text(
                text = All,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
            )
            Text(
                text = Nice,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
            )
    }
}

@Preview(showBackground = true)
@Composable
fun Imageview() {
    HappyBrithdayTheme {
        CheckImageResource(all = All, Nice = Nice )
    }
}


@Composable
fun CheckImageResource(all: String, Nice: String){
    val image = painterResource(R.drawable.ic_task_completed)
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Box() {
                Image(
                    painter = image,
                    contentDescription =null,
                    modifier = Modifier,
                    contentScale = ContentScale.Fit
                )
        }
        TextGreeting(All = All, Nice = Nice)
    }
}


// 텍스트 구간 미리 보기
@Preview(showBackground = false)
@Composable
fun DefaultPreview2() {
    HappyBrithdayTheme {
        TextGreeting(All , Nice)
    }
}

