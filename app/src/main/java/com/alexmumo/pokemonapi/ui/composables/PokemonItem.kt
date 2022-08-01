package com.alexmumo.pokemonapi.ui.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexmumo.pokemonapi.R

@Composable
fun PokemonItem() {
    Column(
        modifier = Modifier
            .height(80.dp)
            .width(80.dp)
    ) {
        Card(
            modifier = Modifier.height(80.dp).width(80.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.th),
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(5.dp)),
                contentDescription = null
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Poke() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        content = {
            items(1000) {
                PokemonItem()
            }
        }
    )
}
@Preview
@Composable
fun PokemonItemPreview() {
    PokemonItem()
}
