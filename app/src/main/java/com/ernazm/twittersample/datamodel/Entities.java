package com.ernazm.twittersample.datamodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Entities implements Parcelable {

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


    private Entities(Parcel in) {
        if (in.readByte() == 0x01) {
            urls = new ArrayList<>();
            in.readList(urls, Url.class.getClassLoader());
        } else {
            urls = null;
        }
        if (in.readByte() == 0x01) {
            hashtags = new ArrayList<>();
            in.readList(hashtags, Object.class.getClassLoader());
        } else {
            hashtags = null;
        }
        if (in.readByte() == 0x01) {
            userMentions = new ArrayList<>();
            in.readList(userMentions, Object.class.getClassLoader());
        } else {
            userMentions = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (urls == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(urls);
        }
        if (hashtags == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(hashtags);
        }
        if (userMentions == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(userMentions);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Entities> CREATOR = new Parcelable.Creator<Entities>() {
        @Override
        public Entities createFromParcel(Parcel in) {
            return new Entities(in);
        }

        @Override
        public Entities[] newArray(int size) {
            return new Entities[size];
        }
    };
}