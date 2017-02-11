package com.example.ernar.myapplication;

import android.app.Application;

import com.example.ernar.myapplication.network.NetworkClient;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NetworkClient.init(this);
    }
}
