package com.alexmumo.pokemonapi.data.remote.di

import com.alexmumo.pokemonapi.data.remote.api.PokemonApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val remoteModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(provideOkhttpClient())
            .build()
            .create(PokemonApi::class.java)
    }
}

fun provideOkhttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(provideHttpLoggingInterceptor())
        .readTimeout(30, TimeUnit.SECONDS)
        .callTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()
}

fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().setLevel(level = HttpLoggingInterceptor.Level.BASIC)
}
