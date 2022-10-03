package com.example.myics342application

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myics342application.databinding.FragmentForecastBinding
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

private val forecastData = listOf(
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

class ForecastFragment : Fragment(R.layout.fragment_forecast){

    private lateinit var binding: FragmentForecastBinding
    private val args: ForecastFragmentArgs by navArgs()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForecastBinding.bind(view)
        binding.forecastList.adapter = ForecastAdapter(forecastData)

    }
}