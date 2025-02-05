package com.example.myapplication4.model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

    public interface ApiService {
        @POST("/api/login")  // Ganti dengan endpoint login Anda
        Call<LoginResponse> login(@Body LoginRequest loginRequest);
    }

