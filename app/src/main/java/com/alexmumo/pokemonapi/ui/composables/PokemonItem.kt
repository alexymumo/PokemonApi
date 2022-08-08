package com.alexmumo.pokemonapi.ui.composables

// ktlint-disable no-wildcard-imports
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun PokemonItem(
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    Card(modifier = Modifier.padding(5.dp)) {
        CoilImage(
            imageRequest = ImageRequest
                .Builder(LocalContext.current)
                .data(imageUrl)
                .build(),
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
    }
}
