package com.example.androidwidgets.radioButtonExample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.androidwidgets.R;

public class ColourChange extends AppCompatActivity {

    RadioGroup radioGroup1;
    RadioButton button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_change);

        radioGroup1=findViewById(R.id.radio_group);
        button1=findViewById(R.id.radioButton1);
        button2=findViewById(R.id.radioButton2);
        button3=findViewById(R.id.radioButton3);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton1:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case R.id.radioButton2:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;
                    case R.id.radioButton3:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
                        break;
                }
            }
        });
    }
}
