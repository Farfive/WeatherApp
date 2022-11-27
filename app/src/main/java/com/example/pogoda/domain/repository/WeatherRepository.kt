package com.example.pogoda.domain.repository

import com.example.pogoda.domain.util.Resource
import com.example.pogoda.domain.weather.WeatherInfo


interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}