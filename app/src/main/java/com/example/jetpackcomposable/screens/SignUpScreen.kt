package com.example.jetpackcomposable.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposable.R
import com.example.jetpackcomposable.componen.HeadingTextComponent
import com.example.jetpackcomposable.componen.MyTextFieldComponent
import com.example.jetpackcomposable.componen.NormalTextComponent
import com.example.jetpackcomposable.componen.PasswordTextFieldComponent


@Composable

fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),


        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Yellow)
        ) {

            NormalTextComponent(
                value = stringResource(id = R.string.hello)
            )

            HeadingTextComponent(
                value = stringResource(id = R.string.welcome_back)
            )
            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                Icons.Default.Person,
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                icon = Icons.Default.Person,

                )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.emil),
                icon = Icons.Default.Email

            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                icon =   Icons.Filled.Lock

            )
        }
    }
}


@Preview
@Composable
private fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}