package com.example.kontak

import android.app.Application
import com.example.kontak.repositri.AppContainer
import com.example.kontak.repositri.KontakContainer

class KontakAplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}