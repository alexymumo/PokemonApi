package com.alexmumo.pokemonapi.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.alexmumo.pokemonapi.data.paging.UserDataSource
import com.alexmumo.pokemonapi.data.remote.api.UserApi
import com.alexmumo.pokemonapi.data.remote.responses.Data
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userApi: UserApi) {
    fun getUser(): Flow<PagingData<Data>> {
        return Pager(
            config = PagingConfig(pageSize = 40, enablePlaceholders = false),
            pagingSourceFactory = {
                UserDataSource(userApi)
            }
        ).flow
    }
}
