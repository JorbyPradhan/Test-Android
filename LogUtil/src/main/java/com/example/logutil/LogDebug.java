package com.example.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "TESTING";

    private static void d(String message){
        Log.d(TAG, message);
    }
}
