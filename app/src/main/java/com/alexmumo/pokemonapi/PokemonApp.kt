package com.alexmumo.pokemonapi

import android.app.Application
import com.alexmumo.pokemonapi.data.repository.repositoryModule
import com.alexmumo.pokemonapi.ui.di.pokemonViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class PokemonApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@PokemonApp)
            androidLogger(level = Level.DEBUG)
            modules(pokemonViewModelModule, repositoryModule,)
        }
    }
}
