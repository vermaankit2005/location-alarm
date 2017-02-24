package com.getwings.receiver;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

import com.getwings.service.AlarmService;

/**
 * Created by ankit.verma on 2/24/2017.
 */

public class AlarmReceiver extends WakefulBroadcastReceiver{

    private static String TAG = "Location Alarm";
    @Override
    public void onReceive(Context context, Intent intent) {
        // Do nothing
        Log.d(TAG, "Received Alarm Notification");
        Intent launchService = new Intent();
        launchService.setClass(context, AlarmService.class);
        startWakefulService(context, launchService);
    }
}
