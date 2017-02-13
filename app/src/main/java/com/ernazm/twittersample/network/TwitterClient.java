package com.ernazm.twittersample.network;

import android.content.Context;
import android.util.Base64;

import com.ernazm.twittersample.R;
import com.ernazm.twittersample.datamodel.AuthToken;
import com.ernazm.twittersample.datamodel.Tweet;
import com.ernazm.twittersample.misc.Log;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TwitterClient {

    private static final String GRANT_TYPE = "client_credentials";

    private static TwitterClient instance;

    private final TwitterApi twitterApi;
    private final String tokenCredentials;
    private final int tweetsFetchCount;

    private AuthToken authToken;

    public static void init(Context context) {
        instance = new TwitterClient(context);
    }

    public static TwitterClient getInstance() {
        return instance;
    }

    private TwitterClient(Context context) {
        final String apiKey = context.getString(R.string.api_key);
        final String apiSecret = context.getString(R.string.api_secret);
        tokenCredentials = getTokenCredentials(apiKey, apiSecret);
        tweetsFetchCount = context.getResources().getInteger(R.integer.tweets_fetch_count);
        twitterApi = new Retrofit.Builder()
                .baseUrl(context.getString(R.string.twitter_base_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TwitterApi.class);
    }

    private String getTokenCredentials(String apiKey, String apiSecret) {
        return Base64.encodeToString((apiKey + ":" + apiSecret).getBytes(), Base64.NO_WRAP);
    }

    public void requestTweets(final String username, final Callback<List<Tweet>> callback) {
        if (authToken == null || !authToken.isBearer()) {
            twitterApi.getAuthToken("Basic " + tokenCredentials, GRANT_TYPE).enqueue(new Callback<AuthToken>() {
                @Override
                public void onResponse(Call<AuthToken> call, Response<AuthToken> response) {
                    if (response.isSuccessful()) {
                        authToken = response.body();
                        if (authToken.isBearer()) {
                            twitterApi.getData(authToken.toAuthString(), username, tweetsFetchCount).enqueue(callback);
                        }
                    } else try {
                        Log.w(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<AuthToken> call, Throwable t) {
                    Log.w(t);
                }
            });
        } else {
            twitterApi.getData(authToken.toAuthString(), username, tweetsFetchCount).enqueue(callback);
        }
    }

}
