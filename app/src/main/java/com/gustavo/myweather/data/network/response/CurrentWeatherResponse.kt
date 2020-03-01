package com.gustavo.myweather.data.network.response


import com.google.gson.annotations.SerializedName
import com.gustavo.myweather.data.database.entity.Current
import com.gustavo.myweather.data.database.entity.Location
import com.gustavo.myweather.data.database.entity.Request

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: Current,
    @SerializedName("location")
    val location: Location,
    @SerializedName("request")
    val request: Request
)