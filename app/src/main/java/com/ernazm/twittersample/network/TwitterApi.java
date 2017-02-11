package com.ernazm.twittersample.network;

import com.ernazm.twittersample.datamodel.AuthToken;
import com.ernazm.twittersample.datamodel.Tweet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface TwitterApi {

    @FormUrlEncoded
    @POST("/oauth2/token")
    @Headers("Content-Type: application/x-www-form-urlencoded;charset=UTF-8")
    Call<AuthToken> getAuthToken(@Header("Authorization") String authorization, @Field("grant_type") String grantType);

    @GET("/1.1/statuses/user_timeline.json")
    Call<List<Tweet>> getData(@Header("Authorization") String authorization, @Query("screen_name") String screenName, @Query("count") int count);

}