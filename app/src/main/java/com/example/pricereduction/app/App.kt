package com.example.pricereduction.app

import android.app.Application

class App: Application(){

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .build();
    }

    fun getComponent() = appComponent
}