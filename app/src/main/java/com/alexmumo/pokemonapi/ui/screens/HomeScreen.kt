package com.alexmumo.pokemonapi.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.alexmumo.pokemonapi.ui.composables.PokemonItem
import com.alexmumo.pokemonapi.ui.viewmodels.PokemonViewModel
import org.koin.androidx.compose.getViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: PokemonViewModel = getViewModel()
) {
    val pokemon = remember {
        viewModel.pokemon
    }.collectAsLazyPagingItems()
    val listState = rememberLazyGridState()
    Column(modifier = Modifier.fillMaxSize()) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            state = listState
        ) {
            items(pokemon.itemCount) { item ->
                pokemon[item]?.let { pokemon ->
                    PokemonItem(
                        imageUrl = pokemon.avatar,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                    )
                }
            }
        }
    }
}
