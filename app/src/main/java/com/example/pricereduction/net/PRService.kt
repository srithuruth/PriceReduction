package com.example.pricereduction.net

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

class PRService{

    @GET(".")
    abstract fun getAlbumDetails(
        @Query("method") operation: String,
        @Query("productid") product: String,
        @Query("color") color: String,
        @Query("api_key") apiKey: String,
        @Query("nowPrice") nowPrice: String
    ): Observable<AlbumDetailsResponse>


}
