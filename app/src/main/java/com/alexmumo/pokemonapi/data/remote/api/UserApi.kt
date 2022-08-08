package com.alexmumo.pokemonapi.data.remote.api

import com.alexmumo.pokemonapi.data.remote.responses.UserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET("users")
    suspend fun fetchUser(
        @Query("page") page: Int,
        @Query("total_pages") total_pages: Int = 10
    ): UserResponse
}

