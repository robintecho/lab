package com.example.a19mca43.activity_life_cycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Log.d("Activity lifecycle","oncreate invoked");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "Activity lifecycle","onStart invoked" );
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "Activity lifecycle","onResume invoked" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "Activity lifecycle","onPause invoked" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "Activity lifecycle","onStop invoked" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "Activity lifecycle","onReStart invoked" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "Activity lifecycle","onDestroy invoked" );
    }
}
