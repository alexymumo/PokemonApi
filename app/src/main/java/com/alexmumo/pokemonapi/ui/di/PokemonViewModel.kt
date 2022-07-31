package com.alexmumo.pokemonapi.ui.di

import androidx.lifecycle.ViewModel
import com.alexmumo.pokemonapi.data.repository.PokemonRepository

class PokemonViewModel(private val pokemonRepository: PokemonRepository) : ViewModel() {

}
