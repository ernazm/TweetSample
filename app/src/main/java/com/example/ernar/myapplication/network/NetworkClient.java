package com.example.ernar.myapplication.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {
    private static NetworkClient ourInstance = new NetworkClient();

    private UmoriliApi umoriliApi;
    private Retrofit retrofit;

    public UmoriliApi getApi() {
        return umoriliApi;
    }

    public static NetworkClient getInstance() {
        return ourInstance;
    }

    private NetworkClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.umori.li/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        umoriliApi = retrofit.create(UmoriliApi.class);
    }
}
