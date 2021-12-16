package com.example.jetpackcompose.uidemo // 練習画面作成した

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
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
    Column {
        SectionContent()
        LazyColumn(
            modifier = Modifier
                .weight(1f)
        ) {
            item {
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
                CellContent("こんにちは", 10)
                CellContent("こんばんは", 30)
                CellContent("おはようございます", 100)
            }
        }
        Row( // 下の四つのボタン
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp, top = 8.dp)
                .height(80.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_home_24),
                contentDescription = "home",
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_emoji_events_24),
                contentDescription = "ranking",
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_campaign_24),
                contentDescription = "news",
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_person_24),
                contentDescription = "profile",
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 8.dp)
            )
        }
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            ) {
                Text(
                    text = "ホーム",
                    fontSize = 13.sp,
                    color = Color(0xffc0c0c0),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "ランキング",
                    fontSize = 13.sp,
                    color = Color(0xffc0c0c0),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "お知らせ",
                    fontSize = 13.sp,
                    color = Color(0xffc0c0c0),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "マイページ",
                    fontSize = 13.sp,
                    color = Color(0xffc0c0c0),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .weight(1f)
                )
            }
        }
    }
}

    @Composable
    fun SectionContent() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 48.dp, end = 48.dp, top = 8.dp)
        ) {
            Text(
                text = "あなた",
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .background(
                        color = Color(0xffffa500),
                        shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp)
                    )
                    .padding(top = 8.dp, bottom = 8.dp)
            )
            Text(
                text = "運営から",
                fontSize = 20.sp,
                color = Color(0xffffa500),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .background(Color.White)
                    .border(
                        width = 1.dp,
                        color = Color(0xffffa500),
                        shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp)
                    )
                    .padding(top = 8.dp, bottom = 8.dp)
            )
        }
    }

    @Composable
    fun CellContent(title: String, time: Int) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xffffccff))
        ) {
            Text(
                text = "title",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp)
            )
            Text(
                text = "...",
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 16.dp)
            )
            Text(
                text = "${time}分前",
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp, bottom = 8.dp)
            )
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
            )
        }
    }