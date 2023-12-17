package com.example.kontak.repositri

import com.example.kontak.service.api.KontakSrvice
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val kontakRepositori: KontakRepositori
}
class KontakContainer : AppContainer{
    private val baseUrl = "https://kancadonor.net//donorq/"
    private val json = Json { ignoreUnknownKeys = true}
    private val retrofit: Retrofit = Retrofit.Builder().addConverterFactory(json.asConverterFactory("application/json".toMediaType())).baseUrl(baseUrl).build()

    private val kontakSrvice : KontakSrvice by lazy{
        retrofit.create(KontakSrvice::class.java)
    }
    override val kontakRepositori: KontakRepositori by lazy {
        NetworkontakRepositori(kontakSrvice)
    }
}