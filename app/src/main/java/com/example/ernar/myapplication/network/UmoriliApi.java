package com.example.ernar.myapplication.network;

import com.example.ernar.myapplication.model.Tweet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UmoriliApi {

    @GET("/api/get")
    Call<List<Tweet>> getData(@Query("name") String resourceName, @Query("num") int count);
}