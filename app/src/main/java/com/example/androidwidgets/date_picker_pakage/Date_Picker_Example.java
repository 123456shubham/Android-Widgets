package com.example.androidwidgets.date_picker_pakage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.androidwidgets.R;

public class Date_Picker_Example extends AppCompatActivity {
    DatePicker datePicker_chart;
    Button button_change;
    TextView textView_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date__picker__example);
        datePicker_chart=findViewById(R.id.date_picker1);
        button_change=findViewById(R.id.change_date_button);
        textView_result=findViewById(R.id.current_date);
        button_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("Current Date :- "+getCurrentDate());
            }

            private String getCurrentDate() {
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append((datePicker_chart.getMonth()+1)+"/");
                stringBuilder.append((datePicker_chart.getDayOfMonth())+"/");
                stringBuilder.append(datePicker_chart.getYear());
                return stringBuilder.toString();
            }
        });

    }
}
