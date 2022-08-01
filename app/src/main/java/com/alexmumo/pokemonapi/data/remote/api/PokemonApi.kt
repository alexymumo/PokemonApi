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

/*val url = "https://api.letbuildthatapp.com/youtube/home_feed"
val request = Request.Builder().url(url).build()
val client = OkHttpClient()
client.newCall(request).enqueue(object : Callback {
    override fun onFailure(call: Call, e: IOException) {
        println("failed to execute")
    }
    override fun onResponse(call: Call, response: Response) {
        val body = response.body.toString()
        print(body)
    }
})

 */
