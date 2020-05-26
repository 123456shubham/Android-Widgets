package com.example.androidwidgets.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.androidwidgets.R;

public class ToogleButtonExample extends AppCompatActivity {
ToggleButton toggleButtonOn,toggleButtonOff;
Button buttonsubmit;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle_button_example);
        toggleButtonOn=findViewById(R.id.toggleButton1);
        toggleButtonOff=findViewById(R.id.toggleButton2);
        buttonsubmit=findViewById(R.id.submit);
        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append("Toggle Button 1").append(toggleButtonOn.getText());
                stringBuilder.append("\n Toggle Button 2 ").append(toggleButtonOn.getText());
                Toast.makeText(ToogleButtonExample.this,stringBuilder.toString(),Toast.LENGTH_SHORT).show();
            }
        });
        //  addToggleButtonListener();
    }

}
