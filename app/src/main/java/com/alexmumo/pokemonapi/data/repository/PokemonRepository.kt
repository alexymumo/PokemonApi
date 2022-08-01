package com.alexmumo.pokemonapi.data.repository

import androidx.paging.PagingData
import com.alexmumo.pokemonapi.data.remote.responses.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {
    fun searchPokemon(searchString: String): Flow<PagingData<Pokemon>>
    // suspend fun getPokemonList(limit: Int, offset: Int): Resource<Pokemon>
}
