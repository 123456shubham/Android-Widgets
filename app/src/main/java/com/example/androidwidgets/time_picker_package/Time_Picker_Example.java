package com.example.androidwidgets.time_picker_package;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.androidwidgets.R;

public class Time_Picker_Example extends AppCompatActivity {

    TimePicker timePicker;
    Button btn_change_time;
    TextView textView_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time__picker__example);
        textView_result=findViewById(R.id.current_time_text_view);
        btn_change_time=findViewById(R.id._change_time_button);
        timePicker=findViewById(R.id.time_picker1);
        timePicker.setIs24HourView(true);
        btn_change_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText(getCurrentTime());
                            }

            private String getCurrentTime() {
                String currentTime = "Current Time :- " + timePicker.getCurrentMinute() + " : "+timePicker.getCurrentMinute();
                return currentTime;
            }
        });
    }
}
