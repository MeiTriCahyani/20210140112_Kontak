package com.example.kontak.repositri

interface KontakRepositori {
    suspend fun getKontak(): List<Kontak>

}

class NetworkontakRepositori(
    private val kontakApiService: KontakService
): KontakRepositori{
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}