package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.androidwidgets.WorkingWithButton.Add;
import com.example.androidwidgets.customToastExample.CustomToastExample;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    private Unbinder unBinder;
@BindView(R.id.addNumber)
Button buttonAdd;

@BindView(R.id.customToast)
Button buttonCustomToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title   By Shubham Chauhan
        getSupportActionBar().hide(); // Hinding The Title Bar By Shubham Chauhan
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen   By Shubham Chauhan
        setContentView(R.layout.activity_main);
      //  buttonAdd=findViewById(R.id.addNumber);
        unBinder=ButterKnife.bind(this);
        ButterKnife.bind(this);

        }
        @OnClick(R.id.addNumber)
        public void add(){
        startActivity(new Intent(MainActivity.this, Add.class));
        }

        @OnClick(R.id.customToast)
         public void buttonCustomToast(){
        startActivity(new Intent(MainActivity.this, CustomToastExample.class));
        }


    }

