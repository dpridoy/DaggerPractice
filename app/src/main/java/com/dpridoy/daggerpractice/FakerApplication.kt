package com.dpridoy.daggerpractice

import android.app.Application
import com.dpridoy.daggerpractice.di.ApplicationComponent
import com.dpridoy.daggerpractice.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}