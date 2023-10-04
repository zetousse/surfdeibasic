package com.example.surfdeibasic.data

data class ResponseDaily(
    val daily: Daily,
    val daily_units: DailyUnits,
    val generationtime_ms: Double,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val timezone_abbreviation: String,
    val utc_offset_seconds: Int
)