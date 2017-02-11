package com.example.ernar.myapplication.viewmodel;

import android.databinding.ObservableField;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

import com.example.ernar.myapplication.model.Tweet;

public class TweetViewModel {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<Spanned> content = new ObservableField<>();
    public final ObservableField<String> site = new ObservableField<>();

    public TweetViewModel(Tweet tweet) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            content.set(Html.fromHtml(tweet.getElementPureHtml(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            content.set(Html.fromHtml(tweet.getElementPureHtml()));
        }
        name.set(tweet.getName());
        site.set(tweet.getSite());
    }
}
