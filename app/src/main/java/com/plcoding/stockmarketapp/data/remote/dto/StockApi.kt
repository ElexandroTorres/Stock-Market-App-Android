package com.plcoding.stockmarketapp.data.remote.dto

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("quary?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apiKey") apiKey : String
    ) : ResponseBody

    companion object {
        const val API_KEY = "4SS228VB9WFBCLGH";
        const val BASE_URL = "HTTPS://alphavantage.co"
    }
}