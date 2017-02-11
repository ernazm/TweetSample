package com.ernazm.twittersample;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

class DataBindingViewHolder<ViewModel> extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;
        private final int variableId;

        public DataBindingViewHolder(ViewDataBinding binding, int variableId) {
            super(binding.getRoot());
            this.binding = binding;
            this.variableId = variableId;
        }

        public void setViewModel(ViewModel viewModel) {
            binding.setVariable(variableId, viewModel);
        }
    }