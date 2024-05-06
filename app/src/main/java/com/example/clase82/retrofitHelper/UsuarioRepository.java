package com.example.clase82.retrofitHelper;

import com.example.clase82.UsuarioResponse;
import com.example.clase82.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UsuarioRepository {

    @FormUrlEncoded
    @POST("guardar")
    Call<UsuarioResponse> guardarUser(@Field("nombre") String nombre,
                                      @Field("apellido") String apellido,
                                      @Field("dni") String dni,
                                      @Field("email") String email,
                                      @Field("edad") String edad);


    @GET("/listar/{nombre}")
    Call<List<User>> getUsers(@Path("nombre") String nombre);
}
