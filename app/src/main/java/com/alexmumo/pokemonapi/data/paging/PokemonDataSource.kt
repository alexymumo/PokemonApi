package com.alexmumo.pokemonapi.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.alexmumo.pokemonapi.data.remote.api.PokemonApi
import com.alexmumo.pokemonapi.data.remote.responses.Result
import retrofit2.HttpException
import java.io.IOException

class PokemonDataSource(private val pokemonApi: PokemonApi, private val searchString: String?) : PagingSource<Int, Result>() {
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
            val offset = params.key ?: 1
            val loadSize = if (searchString == null) params.loadSize else 20
            val data = pokemonApi.fetchPokemon(offset, loadSize)
            val searchTerm = if (searchString != null) {
                data.results.filter {
                    it.name.contains(searchString, true)
                }
            } else {
                data.results
            }
            LoadResult.Page(
                data = searchTerm,
                prevKey = if (offset == 0) null else offset - loadSize,
                nextKey = offset + loadSize
            )
        } catch (e: IOException) {
            return LoadResult.Error(e)
        } catch (e: HttpException) {
            return LoadResult.Error(e)
        }
    }
}
