package com.example.myics342application

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.stringResource
import com.example.myics342application.ui.CurrentConditionsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called")
        setContent {
            CurrentConditionsScreen(
                cityName = stringResource(id = R.string.city_name),
                temperature = stringResource(id = R.string.current_temp, 56))
        }

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}