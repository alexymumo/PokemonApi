package com.alexmumo.pokemonapi.ui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomSearchBar() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "Search Pokemon") },
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun SearchBarPreview() {
    CustomSearchBar()
}
