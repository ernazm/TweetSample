package com.ernazm.twittersample.datamodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Url implements Parcelable {

    @SerializedName("expanded_url")
    @Expose
    private String expandedUrl;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("indices")
    @Expose
    private List<Long> indices = null;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;

    public String getExpandedUrl() {
        return expandedUrl;
    }

    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }


    private Url(Parcel in) {
        expandedUrl = in.readString();
        url = in.readString();
        if (in.readByte() == 0x01) {
            indices = new ArrayList<>();
            in.readList(indices, Long.class.getClassLoader());
        } else {
            indices = null;
        }
        displayUrl = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(expandedUrl);
        dest.writeString(url);
        if (indices == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(indices);
        }
        dest.writeString(displayUrl);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Url> CREATOR = new Parcelable.Creator<Url>() {
        @Override
        public Url createFromParcel(Parcel in) {
            return new Url(in);
        }

        @Override
        public Url[] newArray(int size) {
            return new Url[size];
        }
    };
}