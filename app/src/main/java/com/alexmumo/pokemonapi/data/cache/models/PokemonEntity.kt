package com.alexmumo.pokemonapi.data.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon_table")
data class PokemonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val url: String
)

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
    fun containRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val red = Color.RED
    println(red)
}
