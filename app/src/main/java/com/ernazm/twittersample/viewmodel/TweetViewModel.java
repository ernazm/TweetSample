package com.ernazm.twittersample.viewmodel;

import android.databinding.ObservableField;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;

import com.ernazm.twittersample.datamodel.Tweet;

public class TweetViewModel implements Parcelable {
    public final ObservableField<String> username = new ObservableField<>();
    public final ObservableField<CharSequence> content = new ObservableField<>();
    public final ObservableField<CharSequence> source = new ObservableField<>();

    private final Tweet tweet;

    public TweetViewModel(Tweet tweet) {
        this.tweet = tweet;
        setData(tweet);
    }

    private TweetViewModel(Parcel in) {
        tweet = (Tweet) in.readValue(Tweet.class.getClassLoader());
        setData(tweet);
    }

    private void setData(Tweet tweet) {
        username.set(tweet.getUser().getName());
        content.set(Html.fromHtml(tweet.getText()));
        source.set(Html.fromHtml(tweet.getSource()));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(tweet);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<TweetViewModel> CREATOR = new Parcelable.Creator<TweetViewModel>() {
        @Override
        public TweetViewModel createFromParcel(Parcel in) {
            return new TweetViewModel(in);
        }

        @Override
        public TweetViewModel[] newArray(int size) {
            return new TweetViewModel[size];
        }
    };
}