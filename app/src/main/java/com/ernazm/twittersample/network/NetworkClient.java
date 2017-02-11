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

public class NetworkClient {

    private static final int TWEETS_FETCH_COUNT = 30;

    private static NetworkClient instance;

    private TwitterApi twitterApi;
    private final Context context;
    private AuthToken authToken;

    public static void init(Context context) {
        instance = new NetworkClient(context);
    }

    public static NetworkClient getInstance() {
        return instance;
    }

    private NetworkClient(Context context) {
        this.context = context.getApplicationContext();
        twitterApi = new Retrofit.Builder()
                .baseUrl(context.getString(R.string.twitter_base_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TwitterApi.class);
    }

    private String getTokenCredentials(Context context) {
        String apiKey = context.getString(R.string.api_key);
        String apiSecret = context.getString(R.string.api_secret);
        return Base64.encodeToString((apiKey + ":" + apiSecret).getBytes(), Base64.NO_WRAP);
    }

    public void requestTweets(final String username, final Callback<List<Tweet>> callback) {
        if (authToken == null || !authToken.isBearer()) {
            twitterApi.getAuthToken("Basic " + getTokenCredentials(context), "client_credentials").enqueue(new Callback<AuthToken>() {
                @Override
                public void onResponse(Call<AuthToken> call, Response<AuthToken> response) {
                    if (response.isSuccessful()) {
                        authToken = response.body();
                        if (authToken.isBearer()) {
                            twitterApi.getData(authToken.toAuthString(), username, TWEETS_FETCH_COUNT).enqueue(callback);
                        }
                    } else try {
                        Log.w(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<AuthToken> call, Throwable t) {
                    t.printStackTrace();
                }
            });
        } else {
            twitterApi.getData(authToken.toAuthString(), username, TWEETS_FETCH_COUNT).enqueue(callback);
        }
    }

}
