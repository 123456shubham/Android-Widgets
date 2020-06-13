package com.example.androidwidgets.lifeCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.androidwidgets.R;

public class Life_Cycle_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life__cycle_);
        Log.d("LifeCycle","Life Cycle On Create");

    }
    public void onStart() {
        super.onStart();
        Log.d("Lifecycle", "Life Cycle On Start");
    }
    public void onResume(){
        super.onResume();
        Log.d("LifeCycle","Life Cycle On The Resume");

    }
    public void onPause(){
        super.onPause();
        Log.d("LifeCycle","Life Cycle On The Pause");
    }
    public void onStop(){
        super.onStop();
        Log.d("LifeCycle","Life Cycle On The Stop");

    }
    public  void onRestart(){
        super.onRestart();
        Log.d("LifeCycle","Life Cycle On The ReStart");
    }
    public  void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle","life Cycle On The Destroy");
    }

}
