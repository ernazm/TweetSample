package com.example.ernar.myapplication;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class DataBindingAdapter<ViewModel> extends RecyclerView.Adapter<DataBindingViewHolder<ViewModel>> {

    private final int itemLayoutId;
    private final int variableId;

    public DataBindingAdapter(int itemLayoutId, int variableId) {
        this.itemLayoutId = itemLayoutId;
        this.variableId = variableId;
    }

    @Override
    public DataBindingViewHolder<ViewModel> onCreateViewHolder(ViewGroup parent, int viewType) {
        final ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), itemLayoutId, parent, false);
        return new DataBindingViewHolder<>(binding, variableId);
    }
    @Override
    public void onBindViewHolder(DataBindingViewHolder<ViewModel> holder, int position) {
        holder.setViewModel(getViewModel(position));
    }

    protected abstract ViewModel getViewModel(int position);
}

