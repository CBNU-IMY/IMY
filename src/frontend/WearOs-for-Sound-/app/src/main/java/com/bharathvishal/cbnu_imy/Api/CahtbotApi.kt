package com.bharathvishal.cbnu_imy.Api


import com.bharathvishal.cbnu_imy.Dto.ChatbotDto
import retrofit2.Call
import retrofit2.http.*

interface ChatbotApi {


    @GET("/chatbot/g")
    fun getKogpt2Response(
        @Query("s") s:String
    ): Call<ChatbotDto>


    @GET("/")
    fun getHomeResponse(
    ): Call<String>
}