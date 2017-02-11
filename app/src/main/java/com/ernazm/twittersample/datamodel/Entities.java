
package com.ernazm.twittersample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Entities {

    @SerializedName("urls")
    @Expose
    private List<Url> urls = null;
    @SerializedName("hashtags")
    @Expose
    private List<Object> hashtags = null;
    @SerializedName("user_mentions")
    @Expose
    private List<Object> userMentions = null;

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

}
