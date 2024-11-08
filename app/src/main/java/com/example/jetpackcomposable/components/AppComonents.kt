package com.example.jetpackcomposable.componen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposable.ui.theme.Primary
import com.example.jetpackcomposable.ui.theme.TextColor

@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value, modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp), style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
        ), color = TextColor, textAlign = TextAlign.Center
    )

}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value, modifier = Modifier
            .fillMaxWidth()
            .heightIn(), style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
        ), color = TextColor, textAlign = TextAlign.Center
    )

}


@Composable
fun MyTextFieldComponent(labelValue: String, icon: ImageVector) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        label = { Text(text = labelValue) },
        value = textValue.value,
        colors = TextFieldDefaults.colors(
            cursorColor = Primary,
            focusedLabelColor = Primary,
        ),

        keyboardOptions = KeyboardOptions.Default,
        onValueChange = {
            textValue.value = it
        },
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(4.dp)),
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = ""
            )
        }

    )
}

