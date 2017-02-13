package com.ernazm.twittersample.misc;

import com.ernazm.twittersample.BuildConfig;

public class Log {

    public static final String TAG = "TweetSample";

    public static void d(Object message) {
        if (BuildConfig.DEBUG)
            android.util.Log.d(TAG, message.toString());
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
