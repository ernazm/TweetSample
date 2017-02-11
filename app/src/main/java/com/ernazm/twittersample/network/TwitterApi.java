package com.ernazm.twittersample.network;

import com.ernazm.twittersample.datamodel.Tweet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface TwitterApi {

    @GET("/1.1/statuses/user_timeline.json")
    Call<List<Tweet>> getData(@Header("Authorization") String authorization, @Query("screen_name") String screenName, @Query("count") int count);

}