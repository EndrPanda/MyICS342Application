package com.example.myics342application

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.stringResource
import com.example.myics342application.ui.CurrentConditionsScreen
import com.example.myics342application.ui.ForecastScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called")
        setContent {
            CurrentConditionsScreen(
                cityName = stringResource(id = R.string.city_name),
                temperature = stringResource(id = R.string.current_temp, 56))

//            ForecastScreen(1664600400L, 75F, 55F, 1664600400L, 1664589240L),
//            ForecastScreen(1664762040L, 80F, 60F, 1664762040L, 1664762040L),
//            ForecastScreen(1664848440L, 71F, 68F, 1664848440L, 1664848440L),
//            ForecastScreen(1664934840L, 90F, 85F, 1664934840L, 1664934840L),
//            ForecastScreen(1665021240L, 74F, 53F, 1665021240L, 1665021240L),
//            ForecastScreen(1665107640L, 40F, 35F, 1665107640L, 1665107640L),
//            ForecastScreen(1665194040L, 98F, 84F, 1665194040L, 1665194040L),
//            ForecastScreen(1665280440L, 64F, 63F, 1665280440L, 1665280440L),
//            ForecastScreen(1665366840L, 72F, 70F, 1665366840L, 1665366840L),
//            ForecastScreen(1665453240L, 75F, 55F, 1665453240L, 1665453240L),
//            ForecastScreen(1665539640L, 70F, 68F, 1665539640L, 1665539640L),
//            ForecastScreen(1665626040L, 73F, 71F, 1665626040L, 1665626040L),
//            ForecastScreen(1665712440L, 82F, 79F, 1665712440L, 1665712440L),
//            ForecastScreen(1665798840L, 70F, 67F, 1665798840L, 1665798840L),
//            ForecastScreen(1665885240L, 73F, 55F, 1665885240L, 1665885240L),
//            ForecastScreen(1665971640L, 79F, 57F, 1665971640L, 1665971640L),
        }

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}