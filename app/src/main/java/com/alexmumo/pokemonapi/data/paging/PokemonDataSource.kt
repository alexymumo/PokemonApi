package com.alexmumo.pokemonapi.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.alexmumo.pokemonapi.data.remote.api.PokemonApi
import com.alexmumo.pokemonapi.data.remote.responses.Pokemon

class PokemonDataSource(private val pokemonApi: PokemonApi, private val searchString: String) : PagingSource<Int, Pokemon>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Pokemon> {
        try {
            TODO()
        }catch (e:Exception) {
            return LoadResult.Error(throwable = e
            )
        }
    }
    override fun getRefreshKey(state: PagingState<Int, Pokemon>): Int? {
        return state.anchorPosition
    }
}
