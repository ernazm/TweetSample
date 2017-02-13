package com.ernazm.twittersample;

import android.app.Application;

import com.ernazm.twittersample.network.TwitterClient;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterClient.init(this);
    }
}
