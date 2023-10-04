package com.example.surfdeibasic.data

data class Daily(
    val swell_wave_height_max: List<Double>,
    val swell_wave_period_max: List<Double>,
    val time: List<String>,
    val wave_height_max: List<Double>,
    val wave_period_max: List<Double>,
    val wind_wave_height_max: List<Double>,
    val wind_wave_period_max: List<Double>
)