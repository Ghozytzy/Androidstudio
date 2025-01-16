package com.example.myapplication4.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;

    // Base URL dari API
    private static final String BASE_URL = "https://api.chucknorris.io/";

    // Method untuk mendapatkan instance Retrofit
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) // Base URL
                    .addConverterFactory(GsonConverterFactory.create()) // Konverter untuk JSON
                    .build();
        }
        return retrofit;
    }
}