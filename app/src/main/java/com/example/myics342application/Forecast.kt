package com.example.myics342application

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@Parcelize
data class Forecast(
    val date: Long,
    val highVal: Float,
    val lowVal: Float,
    val sunRiseTime: Long,
    val sunSetTime: Long
) : Parcelable

