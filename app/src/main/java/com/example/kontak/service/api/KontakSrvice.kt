package com.example.kontak.service.api

import com.example.kontak.model.Kontak
import retrofit2.http.GET
import retrofit2.http.Headers

interface KontakSrvice {
    @Headers(
        "Accept: application/json"
    )
    @GET("siswa.json")
    suspend fun getKontak(): List<Kontak>
}