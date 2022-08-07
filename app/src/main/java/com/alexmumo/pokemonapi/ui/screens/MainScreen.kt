package com.alexmumo.pokemonapi.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.alexmumo.pokemonapi.ui.navigation.NavigationGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavigationGraph(navController = navController)
}
