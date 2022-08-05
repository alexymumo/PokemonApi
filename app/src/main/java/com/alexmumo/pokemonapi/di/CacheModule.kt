package com.alexmumo.pokemonapi.di

import androidx.room.Room
import com.alexmumo.pokemonapi.data.cache.db.PokemonDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val cacheModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            PokemonDatabase::class.java,
            "pokemon.db"
        ).build()
    }
}
