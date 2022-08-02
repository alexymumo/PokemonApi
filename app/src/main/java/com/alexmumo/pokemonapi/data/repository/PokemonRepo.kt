package com.alexmumo.pokemonapi.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.alexmumo.pokemonapi.data.paging.PokemonDataSource
import com.alexmumo.pokemonapi.data.remote.api.PokemonApi
import com.alexmumo.pokemonapi.data.remote.responses.Result
import kotlinx.coroutines.flow.Flow

class PokemonRepo(private val pokemonApi: PokemonApi) {
    fun getPokemon(searchTerm: String): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(pageSize = 10, enablePlaceholders = false),
            pagingSourceFactory = {
                PokemonDataSource(pokemonApi, searchTerm)
            }
        ).flow
    }
}
