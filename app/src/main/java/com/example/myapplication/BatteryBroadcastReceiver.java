package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BatteryBroadcastReceiver extends BroadcastReceiver {
    //@Override
    public void onReceive(Context context, Intent intent) {
        int batteryLevel = intent != null ? intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0) : 0;
        TextView textViewBatteryLevel = ((AppCompatActivity) context).findViewById(R.id.textView_batteryLevel);
        textViewBatteryLevel.setText("Porcentaje de batería: " + batteryLevel);
        Log.d("BatteryBroadcastReceiver", "Nivel de batería recibido: " + batteryLevel);
    }
}
