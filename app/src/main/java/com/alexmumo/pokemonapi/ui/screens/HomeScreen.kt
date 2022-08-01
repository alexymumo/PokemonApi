package com.alexmumo.pokemonapi.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.alexmumo.pokemonapi.ui.composables.CustomSearchBar
import com.alexmumo.pokemonapi.ui.composables.Poke

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxHeight().fillMaxWidth()
    ) {
        CustomSearchBar()
        Poke()
    }
}
