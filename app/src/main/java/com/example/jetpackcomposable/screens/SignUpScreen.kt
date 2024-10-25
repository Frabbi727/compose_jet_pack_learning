package com.example.jetpackcomposable.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposable.R
import com.example.jetpackcomposable.components.HeadingTextComponent
import com.example.jetpackcomposable.components.NormalTextComponent

@Composable

fun SignUpScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),

    ) {
      Column(modifier = Modifier.fillMaxSize()) {
          NormalTextComponent(
              value = stringResource(id = R.string.hello)
          )
          HeadingTextComponent(
              value = stringResource(id = R.string.welcome_back)
          )
      }
    }
}

@Preview
@Composable
private fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}