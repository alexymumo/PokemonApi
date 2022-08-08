package com.alexmumo.pokemonapi.di

import com.alexmumo.pokemonapi.data.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        UserRepository(userApi = get())
    }
}
