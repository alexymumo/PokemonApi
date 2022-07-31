package com.alexmumo.pokemonapi.ui.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val pokemonViewModelModule = module {
    viewModel { PokemonViewModel(get()) }
}
