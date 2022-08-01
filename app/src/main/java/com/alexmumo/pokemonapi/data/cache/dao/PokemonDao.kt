package com.alexmumo.pokemonapi.data.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alexmumo.pokemonapi.data.cache.models.PokemonEntity

@Dao
interface PokemonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePokemon(pokemon: List<PokemonEntity>)

    @Query("SELECT * FROM pokemon_table")
    fun fetchPokemon(): List<PokemonEntity>
}
