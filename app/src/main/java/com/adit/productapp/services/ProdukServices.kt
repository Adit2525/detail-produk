package com.adit.productapp.services

import retrofit2.Call
import retrofit2.http.GET
import com.adit.productapp.model.ResponseProduk

interface ProdukServices {
    @GET("products")//endpoint
    fun getAllProduk() : Call<ResponseProduk>
}