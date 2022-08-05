package com.alexmumo.pokemonapi.di

import com.alexmumo.pokemonapi.ui.viewmodels.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        PokemonViewModel(get())
    }
}
