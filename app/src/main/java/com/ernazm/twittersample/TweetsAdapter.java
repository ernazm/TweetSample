package com.ernazm.twittersample;

import com.android.annotations.Nullable;
import com.ernazm.twittersample.misc.Log;
import com.ernazm.twittersample.viewmodel.TweetListViewModel;
import com.ernazm.twittersample.viewmodel.TweetViewModel;

public class TweetsAdapter extends DataBindingAdapter<TweetViewModel> {

    private final TweetListViewModel tweetListViewModel;

    public TweetsAdapter(@Nullable TweetListViewModel tweetListViewModel) {
        super(R.layout.tweet_list_item, BR.tweet);
        this.tweetListViewModel = tweetListViewModel;
    }

    @Override
    protected TweetViewModel getViewModel(int position) {
        return tweetListViewModel.get(position);
    }

    @Override
    public int getItemCount() {
        if (tweetListViewModel == null) {
            Log.w("No TweetListViewModel supplied");
            return 0;
        }
        return tweetListViewModel.size();
    }
}

