package com.softdesign.devintensive.ui.activities;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.softdesign.devintensive.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Жизненный цикл";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart()");
    }
}
