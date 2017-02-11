package com.ernazm.twittersample.viewmodel;

import com.ernazm.twittersample.datamodel.Tweet;

import java.util.ArrayList;
import java.util.List;

public class TweetListViewModel {

    private List<TweetViewModel> tweetViewModels = new ArrayList<>();

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
}
