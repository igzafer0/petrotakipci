package com.igzafer.petrotakipci.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PetroTakipciApp : Application() {
    companion object {
        lateinit var instance:  PetroTakipciApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }


}