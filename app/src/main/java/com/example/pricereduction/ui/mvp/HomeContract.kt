package com.example.pricereduction.ui.mvp

interface HomeContract {

    interface View {
        fun showResults(results: List<Response>)
        fun showError(message: String)
    }

    interface Presenter {
        fun getISSPasses(latitude: String, longitude: String)
    }

}