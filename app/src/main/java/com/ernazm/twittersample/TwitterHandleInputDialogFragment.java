package com.ernazm.twittersample;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.ernazm.twittersample.databinding.TwitterHandleInputBinding;

public class TwitterHandleInputDialogFragment extends DialogFragment {

    public interface IListener {
        void onUsernameEntered(String username);
    }

    private IListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        final TwitterHandleInputBinding binding = TwitterHandleInputBinding.inflate(getActivity().getLayoutInflater());
        builder.setMessage(R.string.enter_twitter_handle_you_want_to_see_timeline_for)
                .setPositiveButton(R.string.show_me, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        listener.onUsernameEntered(binding.input.getText().toString());
                    }
                })
                .setNegativeButton(android.R.string.cancel, null)
                .setView(binding.getRoot());

        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (IListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.getClass().getName() + " must implement " + IListener.class.getName());
        }
    }
}