package com.alexmumo.pokemonapi.data.repository

import org.koin.dsl.module

val repositoryModule = module {
    single<PokemonRepository> { PokemonRepositoryImpl(get()) }
}
