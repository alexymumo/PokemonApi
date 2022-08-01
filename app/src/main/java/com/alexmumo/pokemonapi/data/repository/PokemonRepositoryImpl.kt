package com.alexmumo.pokemonapi.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.alexmumo.pokemonapi.data.paging.PokemonDataSource
import com.alexmumo.pokemonapi.data.remote.api.PokemonApi
import com.alexmumo.pokemonapi.data.remote.responses.Pokemon
import kotlinx.coroutines.flow.Flow

class PokemonRepositoryImpl(private val pokemonApi: PokemonApi) : PokemonRepository {
    override fun searchPokemon(searchString: String): Flow<PagingData<Pokemon>> = Pager(
        config = PagingConfig(pageSize = 10, enablePlaceholders = false),
        pagingSourceFactory = {
            PokemonDataSource(pokemonApi, searchString)
        }
    ).flow
}
