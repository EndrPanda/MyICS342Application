package com.example.myics342application.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import com.example.myics342application.Forecast
import com.example.myics342application.R


@Composable
fun ForecastScreen(
//    cityName: String,
//    temperature: String,
    forecast: List<Forecast>
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = "city",
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
                text = forecast.toString(),
                style = TextStyle(
                    fontSize = 10.sp,
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

        forecast.forEach { message ->
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = forecast.toString(),
                    style = TextStyle(
                        fontSize = 30.sp,
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
    }
}

@Preview(
    "Forecast",
    device = Devices.PIXEL_4,
    showBackground = true,
    showSystemUi = true,
)

@Composable
fun ForecastPreview() {
    val forecastData = listOf(
        Forecast(1664600400L, 75F, 55F, 1664600400L, 1664589240L),
        Forecast(1664762040L, 80F, 60F, 1664762040L, 1664762040L),
        Forecast(1664848440L, 71F, 68F, 1664848440L, 1664848440L),
        Forecast(1664934840L, 90F, 85F, 1664934840L, 1664934840L),
        Forecast(1665021240L, 74F, 53F, 1665021240L, 1665021240L),
        Forecast(1665107640L, 40F, 35F, 1665107640L, 1665107640L),
        Forecast(1665194040L, 98F, 84F, 1665194040L, 1665194040L),
        Forecast(1665280440L, 64F, 63F, 1665280440L, 1665280440L),
        Forecast(1665366840L, 72F, 70F, 1665366840L, 1665366840L),
        Forecast(1665453240L, 75F, 55F, 1665453240L, 1665453240L),
        Forecast(1665539640L, 70F, 68F, 1665539640L, 1665539640L),
        Forecast(1665626040L, 73F, 71F, 1665626040L, 1665626040L),
        Forecast(1665712440L, 82F, 79F, 1665712440L, 1665712440L),
        Forecast(1665798840L, 70F, 67F, 1665798840L, 1665798840L),
        Forecast(1665885240L, 73F, 55F, 1665885240L, 1665885240L),
        Forecast(1665971640L, 79F, 57F, 1665971640L, 1665971640L),
    )
    ForecastScreen(
        forecast = forecastData,
    )
}