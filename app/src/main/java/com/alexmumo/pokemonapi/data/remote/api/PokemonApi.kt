package com.alexmumo.pokemonapi.data.remote.api

import com.alexmumo.pokemonapi.data.remote.responses.Pokemon
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApi {
    @GET("pokemon")
    suspend fun fetchPokemon(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Pokemon
}

