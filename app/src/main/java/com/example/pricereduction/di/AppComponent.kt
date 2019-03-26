package com.example.pricereduction.di

import com.example.lastfm.di.NetworkModule
import com.example.pricereduction.net.PRService
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface AppComponent {
    fun issService(): PRService
}