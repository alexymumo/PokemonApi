package com.alexmumo.pokemonapi.data.repository.di

import com.alexmumo.pokemonapi.data.repository.PokemonRepo
import org.koin.dsl.module

val repositoryModule = module {
    single {
        PokemonRepo(get())}
}
