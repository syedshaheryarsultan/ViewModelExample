package com.example.viewmodelexample.interfaces;

import com.example.viewmodelexample.model.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    @GET("marvel/")
    Call<List<Hero>> getHeroes();

}
