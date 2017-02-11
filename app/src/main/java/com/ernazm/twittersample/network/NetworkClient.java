package com.ernazm.twittersample.network;

import android.content.Context;

import com.ernazm.twittersample.R;
import com.ernazm.twittersample.datamodel.Tweet;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {

    private static NetworkClient instance;

    private TwitterApi twitterApi;
    private String authorization;

    public static void init(Context context) {
        instance = new NetworkClient(context);
    }

    public static NetworkClient getInstance() {
        return instance;
    }

    private NetworkClient(Context context) {
        twitterApi = new Retrofit.Builder()
                .baseUrl(context.getString(R.string.twitter_base_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TwitterApi.class);
    }

    public void requestTweets(Callback<List<Tweet>> callback){
        twitterApi.getData(authorization,"twitterapi", 10).enqueue(callback);
    }

}
