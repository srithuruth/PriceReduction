package com.example.pricereduction.ui.di

import com.example.pricereduction.net.PRService
import com.example.pricereduction.ui.mvp.HomeContract
import com.example.pricereduction.ui.mvp.HomePresenter
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val view: HomeContract.View) {


    @HomeScope
    @Provides
    fun provideHomePresenter(prService: PRService)
            : HomeContract.Presenter {
        return HomePresenter(prService, view)
    }
}