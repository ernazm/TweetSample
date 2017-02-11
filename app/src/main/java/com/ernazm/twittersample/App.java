package com.ernazm.twittersample;

import android.app.Application;

import com.ernazm.twittersample.network.NetworkClient;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NetworkClient.init(this);
    }
}
