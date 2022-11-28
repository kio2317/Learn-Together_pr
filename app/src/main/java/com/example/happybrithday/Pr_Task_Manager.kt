package com.example.happybrithday


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybrithday.ui.theme.HappyBrithdayTheme


class Pr_Task_Manager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBrithdayTheme {

                Surface{
                    TaskCompletedScreen()
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // image
        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        //Text
        Text(
            text = stringResource(R.string.all_task_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        //text
        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 16.sp
        )
    }
}

// 결과 미리 보기
@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    HappyBrithdayTheme {
        Surface{
            TaskCompletedScreen()
        }
    }
}


/*
Column: 화면에 세로로 배치
Alignment?
View의 정렬을 지원해주는 변수
---
Column의 Alignment
column의 자식 View? 들은 수직으로 배치되므로 수평으로 정렬(horizontalAlignment) 지원
수평정렬: 모든 자식 View들의 x위치가 동일하도록 만들어 준다.
---
Cokumn에서 사용할 수 있는 Alignment 종류

Alignment.Start(왼쪽 정렬)
Alignment.CenterHorizontally (중앙 정렬)
Alignment.End(오른쪽 정렬)
-----
vertical Arrangement?
View 배치 (Arrangement)를 지원해주는 변수
Column에서는 Arrangement.Vertical 상속받는 6가지를 Arrangement가 있다.
-
Arrangement.Top - 위 정렬
Arrangement.Center - 중앙 정렬
Arrangement.Bottom - 아래 정렬
---
기본적으로 space 들어간 옵션은 모두 컨포넌트들간의 간격을 동일하게 맞춰준다.
Arrangement.SpaceBetween - 컴포넌트 간의 간격을 동일 하게 맞춘다. 양쪽 끝과 컴포넌트 사이에 빈 공간이 0인 Arrangement
Arrangement.SpaceAround - 양쪽 끝 컴포넌트와 레이아웃의 간격을 컴포넌트들간 간격의 절반으로 만든다.
Arrangement.SpaceEvenly - 양쪽 끝 컴포넌트와 레이아웃의 간격을 컴포넌트드간 간격과 같게 만든다.
---
font Weight Text 컴포저블의 글꼴 두께를 설정
Android Jetpack Compose에서 Text 컴포저블 의 선택적 매개변수에 필요한 FontWeight값을 전달합니다.
---
String Resource:
문자열 리소스를 사용하여 애플리케이션의 텍스트 문자열에 최적의 텍스트 스타일과 서식을 지정
---
스스로 짜본 코드와 솔루션 코드의 차이
--
1. image text를 따로 @Composable 만들어서 하는게 아니였어요.
2. 앱 미리보기 같은 경우 텍스트와 이미지 불리해서 하는게 아니였어요.
3. Align | Arrangement 차이를 몰라 가운데 정렬을 못했어요.
4. 컨포넌트? 의 개념을 아직 몰라요.
5. 그 외 부족한게 너무 많았어요 ㅠ
6. -반복- 학습
-
*/


