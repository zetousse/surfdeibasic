package com.example.surfdeibasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.surfdeibasic.model.RetrofitServiceFactory
import com.example.surfdeibasic.ui.theme.SurfdeiBasicTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val service = RetrofitServiceFactory.makeRetrofitService()

        lifecycleScope.launch {
             val result = service.getWeather(
                36.5267,
                -6.2891,
                "wave_height_max,wave_period_max,wind_wave_height_max,wind_wave_period_max,swell_wave_height_max,swell_wave_period_max",
                "Europe/Berlin",
            )
            println("REFERENCIA: $result")
        }

        setContent {
            SurfdeiBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                Text(
                    text = "Hello, Pepe"
                )

                }
            }
        }
    }
}

