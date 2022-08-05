package com.alexmumo.pokemonapi

import android.app.Application
import com.alexmumo.pokemonapi.di.cacheModule
import com.alexmumo.pokemonapi.di.presentationModule
import com.alexmumo.pokemonapi.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import java.util.*

class PokemonApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            val modules = listOf(presentationModule, cacheModule, repositoryModule)
            androidLogger(level = Level.INFO)
            androidContext(this@PokemonApp)
            modules()
        }
    }
}
