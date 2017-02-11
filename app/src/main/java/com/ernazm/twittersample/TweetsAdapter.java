package com.ernazm.twittersample;

import com.ernazm.twittersample.viewmodel.TweetListViewModel;
import com.ernazm.twittersample.viewmodel.TweetViewModel;

public class TweetsAdapter extends DataBindingAdapter<TweetViewModel> {

    private TweetListViewModel tweetListViewModel;

    public TweetsAdapter(TweetListViewModel tweetListViewModel) {
        super(R.layout.list_item, BR.tweet);
        this.tweetListViewModel = tweetListViewModel;
    }

    @Override
    protected TweetViewModel getViewModel(int position) {
        return tweetListViewModel.get(position);
    }

    @Override
    public int getItemCount() {
        if (tweetListViewModel == null)
            return 0;
        return tweetListViewModel.size();
    }
}

