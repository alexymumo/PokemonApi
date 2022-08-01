package com.alexmumo.pokemonapi.data.cache.db

import androidx.room.RoomDatabase
import com.alexmumo.pokemonapi.data.cache.dao.PokemonDao

abstract class PokemonDatabase : RoomDatabase() {
    abstract fun pokemonDao(): PokemonDao
}
