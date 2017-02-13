package com.ernazm.twittersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ernazm.twittersample.databinding.FragmentTimelineBinding;
import com.ernazm.twittersample.datamodel.Tweet;
import com.ernazm.twittersample.misc.Log;
import com.ernazm.twittersample.network.TwitterClient;
import com.ernazm.twittersample.viewmodel.TweetListViewModel;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TimelineFragment extends Fragment {

    private static final String BUNDLE_KEY_TWEET_LIST_VIEW_MODEL = "tweetListViewModel";

    private FragmentTimelineBinding binding;
    private TweetListViewModel tweetListViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTimelineBinding.inflate(inflater, container, false);
        tweetListViewModel = savedInstanceState == null ? new TweetListViewModel()
                : savedInstanceState.<TweetListViewModel>getParcelable(BUNDLE_KEY_TWEET_LIST_VIEW_MODEL);

        binding.list.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.list.setAdapter(new TweetsAdapter(tweetListViewModel));

        return binding.getRoot();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(BUNDLE_KEY_TWEET_LIST_VIEW_MODEL, tweetListViewModel);
    }

    public void requestTimeline(String username) {
        TwitterClient.getInstance().requestTweets(username, new Callback<List<Tweet>>() {
            @Override
            public void onResponse(Call<List<Tweet>> call, Response<List<Tweet>> response) {
                if (response.isSuccessful())
                    onListLoaded(response.body());
                else try {
                    Log.w(response.errorBody().string());
                } catch (IOException e) {
                    Log.w(e);
                }
            }

            @Override
            public void onFailure(Call<List<Tweet>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void onListLoaded(List<Tweet> tweets) {
        tweetListViewModel.set(tweets);
        binding.list.getAdapter().notifyDataSetChanged();
    }
}
