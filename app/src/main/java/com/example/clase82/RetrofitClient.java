package com.example.clase82;

import com.example.clase82.retrofitHelper.UsuarioRepository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static UsuarioRepository getInstance(String baseUrl){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UsuarioRepository.class);
    }
}
