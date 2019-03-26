package com.example.pricereduction.ui.di

import com.example.pricereduction.di.AppComponent
import com.example.pricereduction.ui.mvp.MainActivity
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
@HomeScope
interface HomeComponent {
    fun inject(mainActivity: MainActivity)
}