package com.example.myapplication4.services;

import com.example.myapplication4.models.Joke;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesService{
        @GET("/jokes/random") // Menandakan endpoint API yang akan dipanggil
        Call<Joke> getRandomJoke();  // Mendeklarasikan metode untuk mendapatkan data 'Joke'
    }

