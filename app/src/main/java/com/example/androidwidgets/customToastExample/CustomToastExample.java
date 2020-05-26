package com.example.androidwidgets.customToastExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidwidgets.R;

public class CustomToastExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast_example);
        LayoutInflater li=getLayoutInflater();
        View layout=li.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.custom_toast_layout));
        // Creating Toast
        Toast toast=new Toast(CustomToastExample.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();

    }
}
