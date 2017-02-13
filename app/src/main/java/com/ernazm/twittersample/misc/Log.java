package com.ernazm.twittersample.misc;

import com.ernazm.twittersample.BuildConfig;

public class Log {

    private static final String TAG = "TweetSample";

    public static void d(String message) {
        if (BuildConfig.DEBUG)
            android.util.Log.d(TAG, message);
    }

    public static void w(String message) {
        if (BuildConfig.DEBUG)
            android.util.Log.w(TAG, message);
    }

    public static void w(Throwable t) {
        if (BuildConfig.DEBUG)
            android.util.Log.w(TAG, t);
    }
}
