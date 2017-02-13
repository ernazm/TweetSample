package com.ernazm.twittersample.viewmodel;

import android.databinding.ObservableField;
import android.text.Html;

import com.ernazm.twittersample.datamodel.Tweet;

public class TweetViewModel {
    public final ObservableField<String> username = new ObservableField<>();
    public final ObservableField<CharSequence> content = new ObservableField<>();
    public final ObservableField<CharSequence> source = new ObservableField<>();
    private final Tweet tweet;

    public TweetViewModel(Tweet tweet) {
        this.tweet = tweet;
        setData(tweet);
    }

    private void setData(Tweet tweet) {
        username.set(tweet.getUser().getName());
        content.set(Html.fromHtml(tweet.getText()));
        source.set(Html.fromHtml(tweet.getSource()));
    }
}
