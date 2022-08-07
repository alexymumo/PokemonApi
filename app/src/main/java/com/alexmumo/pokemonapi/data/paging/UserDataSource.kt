package com.alexmumo.pokemonapi.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.alexmumo.pokemonapi.data.remote.api.UserApi
import com.alexmumo.pokemonapi.data.remote.responses.Data
import retrofit2.HttpException
import java.io.IOException

class UserDataSource(private val userApi: UserApi) : PagingSource<Int, Data>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Data> {
        return try {
            val nextPage = params.key ?: 1
            val userList = userApi.fetchUser(nextPage)
            LoadResult.Page(
                data = userList.data,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = nextPage.plus(1)
                // nextKey = if (userList.data.isEmpty()) null else userList.page + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
    override fun getRefreshKey(state: PagingState<Int, Data>): Int? {
        return state.anchorPosition
    }
}
