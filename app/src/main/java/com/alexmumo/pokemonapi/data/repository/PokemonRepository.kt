package com.alexmumo.pokemonapi.data.repository

import com.alexmumo.pokemonapi.data.remote.responses.Pokemon
import com.alexmumo.pokemonapi.util.Resource

interface PokemonRepository {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<Pokemon>
}
