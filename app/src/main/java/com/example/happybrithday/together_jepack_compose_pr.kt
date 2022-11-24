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
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybrithday.ui.theme.HappyBrithdayTheme

class together_jepack_compose_pr : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // doqㅇ
        setContent {
            HappyBrithdayTheme {
                Surface(color = MaterialTheme.colors.background) {
                    // 이미지 소스와 텍스트 화면 출력?
                    ImageResource(
                        name = A, name2 = B, name3 = C
                    )
                }
            }
        }
    }
}


// 텍스트 변수로 처리
var A = "Jetpack Compose tutorial"
var B = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
var C = "In this tutorial, you build a simple Contacts.Intents.UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."


//미리보기 배경 표시 -> 텍스트 3개 화면에 미리 보기
@Preview(showBackground = true)
@Composable
fun GreetingTexttPreview2() {
    HappyBrithdayTheme {
        GreetingText(A, B, C )
    }
}

@Composable
// Greeting Text 문자열 3개를 받는다.
fun GreetingText(name: String, name2:String, name3:String) {
    Column{

        //Box() { } Box : 한 요소를 다른 요소 위에 배치 Text에 넣으면 안됐다.
        // 문자열 1 text name변수, fontsize 24,sp, padding 을 준다.
        Text(
            text = name,
            fontSize= 24.sp,
            modifier = Modifier
                .padding(start =16.dp , top = 16.dp, end = 16.dp, bottom = 16.dp)
        )

        Text(
            text = name2,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp,)
        )
        Text(
            text = name3,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
        )
    }
}


// 앱 실행 하는 곳 true image와 3개의 텍스트를 화면에 나타내면 된다.
@Preview(showBackground = true)
@Composable
fun Imagepreview(){
    HappyBrithdayTheme() {
        ImageResource(name = A, name2 = B, name3 =C )

    }
}

@Composable
// 함수 ImageResource 변수 3개
fun ImageResource(name: String,name2: String,name3: String) {
    // 이미지 가져오기 R. drawable.bg_compose_background
    val image = painterResource(R.drawable.bg_compose_background)
    //Column: 항목을 화면에 세로로 배치
    Column() {
        // 한 요소를 다른 요소 위에 배치
        // box를 image 에 넣어서 성공
        Box {
            Image(
                // Image 컴포저블 또는 paint 제어자에 painterResource를 사용하고 Null 값으로 주면 된다.
                // 컴포저블의 크기, 레이아웃, 동작 및 모양 변경
                // 접근성 라벨과 같은 정보 추가
                // modifier = Modi
                // 1. 사용자 입력 처리
                // 2. 요소를 클릭 가능
                // 3. 스크롤 가능
                // 드래그 가능 또는 확대/축소 가능하게 만드는 것과 같은 높은 수준의 상호작용 추가
                painter =image,
                contentDescription = null,
                modifier = Modifier,
                // contentScale : 너비를 채우기 위해 모든 크기의 이미지를 전달하여 악용할 수 있는 컴포저블
                contentScale = ContentScale.FillWidth

            )
    }
        GreetingText(name = name, name2 = name2, name3 =name3 )

    }
}