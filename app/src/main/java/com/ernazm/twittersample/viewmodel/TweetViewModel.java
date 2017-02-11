package com.ernazm.twittersample.viewmodel;

import android.databinding.ObservableField;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;

import com.ernazm.twittersample.datamodel.Tweet;

public class TweetViewModel {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<Spanned> content = new ObservableField<>();
    public final ObservableField<String> site = new ObservableField<>();

    public TweetViewModel(Tweet tweet) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            content.set(Html.fromHtml(tweet.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
//        } else {
//            content.set(Html.fromHtml(tweet.getElementPureHtml()));
//        }
        content.set(new SpannedString(tweet.getText()));
        name.set(tweet.getUser().getName());
        site.set(tweet.getSource());
    }
}
