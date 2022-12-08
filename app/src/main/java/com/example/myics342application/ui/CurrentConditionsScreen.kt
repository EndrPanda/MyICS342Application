package com.example.myics342application.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myics342application.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp


@Composable
fun CurrentConditionsScreen(
    cityName: String,
    temperature: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = cityName,
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(400)
            )
        )
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = temperature,
                style = TextStyle(
                    fontSize = 72.sp,
                    fontWeight = FontWeight(600)
                )
            )
            Spacer(modifier = Modifier.weight(1.0f, fill = true))
            Image(
                modifier = Modifier.size(72.dp),
                painter = painterResource(id = R.drawable.sun_icon),
                contentDescription = "Sunny",
            )
        }
    }
    LocationForecastButton()
}

@Composable
fun LocationForecastButton() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = {
                LocationForecastScreen()
            },
            modifier = Modifier.padding(all = Dp(10F)),
            enabled = true,
            border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue)),
            shape = MaterialTheme.shapes.medium,
        )
        {
            Text(text = "Location Forecast", color = Color.White)
        }
    }
}

@Preview(
    "CurrentConditions",
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun CurrentConditionsScreenPreview() {
    CurrentConditionsScreen(
        cityName = "St. Paul, MN",
        temperature = "109"
    )
}