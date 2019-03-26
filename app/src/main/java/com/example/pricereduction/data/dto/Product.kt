package com.example.pricereduction.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import retrofit2.http.Query

class Album {
    @SerializedName("productid")
    @Expose
    val productid: String? = null
    @SerializedName("color")
    @Expose
    val color: String? = null
    @SerializedName("nowPrice")
    @Expose
    val nowPrice: String? = null

}