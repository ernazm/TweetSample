package com.ernazm.twittersample.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.ernazm.twittersample.datamodel.Tweet;

import java.util.ArrayList;
import java.util.List;

public class TweetListViewModel implements Parcelable {

    private List<TweetViewModel> tweetViewModels = new ArrayList<>();

    public TweetListViewModel() {
    }

    protected TweetListViewModel(Parcel in) {
        tweetViewModels = new ArrayList<>();
        in.readList(tweetViewModels, TweetViewModel.class.getClassLoader());
    }

    public void set(List<Tweet> tweets) {
        tweetViewModels.clear();
        for (Tweet tweet : tweets) {
            tweetViewModels.add(new TweetViewModel(tweet));
        }
    }

    public TweetViewModel get(int position) {
        return tweetViewModels.get(position);
    }

    public int size() {
        return tweetViewModels.size();
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(tweetViewModels);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<TweetListViewModel> CREATOR = new Parcelable.Creator<TweetListViewModel>() {
        @Override
        public TweetListViewModel createFromParcel(Parcel in) {
            return new TweetListViewModel(in);
        }

        @Override
        public TweetListViewModel[] newArray(int size) {
            return new TweetListViewModel[size];
        }
    };
}
