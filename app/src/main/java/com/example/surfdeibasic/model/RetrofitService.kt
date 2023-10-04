package com.example.surfdeibasic.model

import com.example.surfdeibasic.data.ResponseDaily
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

import retrofit2.converter.gson.GsonConverterFactory


// esta es la petición a la API de marine.api-open-meteo.com/v1/marine

interface RetrofitService {
    @GET("/v1/marine")
    suspend fun getWeather(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
        @Query("daily") hourly: String,       //Elegir entre horario o diario
        @Query("timezone") timezone: String,
    ): ResponseDaily
}

object RetrofitServiceFactory {
    fun makeRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://marine-api.open-meteo.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }
}