package com.alexmumo.pokemonapi.data.repository

import com.alexmumo.pokemonapi.data.remote.api.PokemonApi
import com.alexmumo.pokemonapi.data.remote.responses.Pokemon
import com.alexmumo.pokemonapi.util.Resource
import retrofit2.HttpException
import java.io.IOException

class PokemonRepositoryImpl(private val pokemonApi: PokemonApi) : PokemonRepository {
    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<Pokemon> {
        val response = try {
            pokemonApi.fetchPokemon(offset, limit)
        } catch (e: IOException) {
            return Resource.Error("IOException")
        } catch (e: HttpException) {
            return Resource.Error("IOException")
        }
        return Resource.Success(response)
    }
}
