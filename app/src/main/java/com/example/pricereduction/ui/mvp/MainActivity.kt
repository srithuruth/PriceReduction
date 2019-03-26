package com.example.pricereduction.ui.mvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.pricereduction.R
import com.example.pricereduction.app.App
import com.example.pricereduction.ui.di.HomeModule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerHomeComponent.builder()
            .appComponent((application as App).getComponent())
            .homeModule(HomeModule(this))
            .build()
            .inject(this)




        rvPasses.layoutManager = LinearLayoutManager(this)
        rvPasses.adapter = issAdapter

        btnSubmit.setOnClickListener {
            homePresenter.getISSPasses(etLatitude.text.toString(),
                etLongitude.text.toString())
        }


    }

    override fun showResults(results: List<Response>) {
        issAdapter.setData(results)
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


}
