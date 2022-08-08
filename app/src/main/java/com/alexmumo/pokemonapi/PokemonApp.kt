package com.alexmumo.pokemonapi

import android.app.Application
import com.alexmumo.pokemonapi.di.presentationModule
import com.alexmumo.pokemonapi.di.remoteModule
import com.alexmumo.pokemonapi.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class PokemonApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            val modules = listOf(presentationModule, repositoryModule, remoteModule)
            androidLogger(level = Level.NONE)
            androidContext(this@PokemonApp)
            modules(modules)
        }
    }
}
