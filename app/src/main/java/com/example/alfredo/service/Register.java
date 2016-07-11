package com.example.alfredo.service;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Alfredo on 11/07/2016.
 */
public interface Register {

    @GET("/api/register")
    void getEmpresa(Callback<>)
}