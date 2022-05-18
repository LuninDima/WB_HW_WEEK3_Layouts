package com.example.constraintlayout

import android.graphics.Paint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp



class FacebookComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                SignInScreen()
            }


        }
    }
}

@Composable
fun SignInScreen() {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = R.drawable.facebooklogo),
            contentDescription = "Facebook Logo",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally)
                .padding(0.dp, 10.dp),

            )

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp, 3.dp),
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Телефон или электронный адрес ") },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(0x00000000))
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp, 3.dp),
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Пароль") },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0x00000000)
            )
        )

        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp, 3.dp),
            shape = RoundedCornerShape(5.dp)

        ) {
            Text(text = "Войти", color = Color.White)
        }
        TextButton(onClick = {}) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(50.dp, 3.dp),
                text = "Забыли пароль?",
                color = Color.Blue
            )


        }
    }
}
