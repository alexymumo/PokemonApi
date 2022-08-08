package com.alexmumo.pokemonapi.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.alexmumo.pokemonapi.data.remote.responses.Data
import com.alexmumo.pokemonapi.data.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class PokemonViewModel(private val pokemonRepository: UserRepository) : ViewModel() {
    val pokemon: Flow<PagingData<Data>> get() = fetchUser()

    private fun fetchUser(): Flow<PagingData<Data>> {
        return pokemonRepository.getUser().cachedIn(viewModelScope)
    }
}
