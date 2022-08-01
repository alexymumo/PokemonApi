package com.alexmumo.pokemonapi.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexmumo.pokemonapi.R

@Composable
fun PokemonDetail() {
    Column(
        modifier = Modifier.fillMaxWidth().height(100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.th),
            contentDescription = null
        )
    }
}

@Composable
@Preview
fun PokemonDetailPreview() {
    PokemonDetail()
}
