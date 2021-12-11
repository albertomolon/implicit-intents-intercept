package com.example.implicit.intents.interception;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class EvilActivity extends Activity {

    final static String TAG = "EVIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evil);

        // Get the intent that started this activity
        Intent intent = getIntent();
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();

        if (data != null) {
            Log.i(TAG, intent.toString());
            Log.i(TAG, "DATA = " + data.toString());
        }

        if (extras != null) {
            String[] keys = extras.keySet().toArray(new String[0]);
            for (String key : keys) {
                Log.i(TAG, key + " => " + extras.get(key).toString());
            }
        }
        else
            Log.i(TAG, "No extras in this intent");


//        // Figure out what to do based on the intent type
//        if (intent.getType().contains("image/")) {      // Handle intents with image data ...
//
//        } else if (intent.getType().equals("text/plain")) {     // Handle intents with text ...
//
//        } else {
//            //
//        }

    }
}