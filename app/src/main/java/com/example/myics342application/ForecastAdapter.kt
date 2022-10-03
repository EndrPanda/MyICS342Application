package com.example.myics342application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

class ForecastAdapter(private val data: List<Forecast>) : RecyclerView.Adapter<ForecastViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_forecast_item, parent, false)
        return ForecastViewHolder(view)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}

class ForecastViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val forecastDate: TextView
    private val forecastHigh: TextView
    private val forecastLow: TextView
    private val forecastSunrise: TextView
    private val forecastSunset: TextView

    init {
        forecastDate = view.findViewById(R.id.forecast_date)
        forecastHigh = view.findViewById(R.id.forecast_high_val)
        forecastLow = view.findViewById(R.id.forecast_low_val)
        forecastSunrise = view.findViewById(R.id.forecast_sunrise_time)
        forecastSunset = view.findViewById(R.id.forecast_sunset_time)
    }

    fun bind(data: Forecast) {
        val dateTimeStamp = data.date
        val formatter = DateTimeFormatter.ofPattern("MMM dd")
        val dateTime = LocalDateTime.ofEpochSecond(dateTimeStamp, 0, ZoneOffset.of("-5"))
        val formattedDate = formatter.format(dateTime)

        val timeFormatter = DateTimeFormatter.ofPattern("h:mm")
        val formattedTime = timeFormatter.format(dateTime)

        forecastDate.text = formattedDate
        forecastHigh.text = data.highVal.toString()
        forecastLow.text = data.lowVal.toString()
        forecastSunrise.text = formattedTime
        forecastSunset.text = formattedTime
    }
}