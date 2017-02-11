package com.example.ernar.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ernar.myapplication.databinding.FragmentMainBinding;
import com.example.ernar.myapplication.datamodel.Tweet;
import com.example.ernar.myapplication.viewmodel.TweetListViewModel;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private FragmentMainBinding binding;
    private TweetListViewModel tweetListViewModel;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        tweetListViewModel = new TweetListViewModel();

        binding.list.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.list.setAdapter(new TweetsAdapter(tweetListViewModel));

        return binding.getRoot();
    }

    public void onListLoaded(List<Tweet> tweets) {
        tweetListViewModel.set(tweets);
        binding.list.getAdapter().notifyDataSetChanged();
    }
}
