package com.example.jetpackcompose.uidemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstView()
        }
    }
}

@Composable
private fun FirstView() {
    Column{
        Image(
            painter = painterResource(id = R.drawable.line),
            contentDescription = "LINEのアイコン",
            modifier = Modifier
                .size(288.dp)
                .fillMaxWidth()
                .padding(start = 112.dp) // アイコンの周りの空白
        )
        Text(
            text = "LINEへようこそ",
            fontSize = 26.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 104.dp, bottom = 8.dp) // 「LINEへようこそ」の周りの空白
        )
        Text(
            text = "無料のメールや音声・ビデオ通話を楽しもう！",
            fontSize = 13.sp,
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 64.dp) // 「無料～楽しもう！」の周りの空白
        )
        Text(
            text = "",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 128.dp) // 無料～楽しもう！から、ログインボタンまでの空白
        )
        Text(
            text = "ログイン",
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier
                .padding(start = 72.dp) // ログインボタンの周りの空白
                .background(Color.Green)
                .padding(start = 96.dp, end = 96.dp, top = 16.dp, bottom = 16.dp) //　「ログイン」文字の周りの空白
        )
        Text(
            text = "新規登録",
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 72.dp) // 新規登録ボタンの周りの空白
                .background(Color.White)
                .padding(start = 96.dp, end = 96.dp, top = 16.dp, bottom = 16.dp) //　「新規登録」文字の周りの空白
        )
    }
}