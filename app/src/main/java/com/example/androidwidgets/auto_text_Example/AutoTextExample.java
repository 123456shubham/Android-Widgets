package com.example.androidwidgets.auto_text_Example;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.androidwidgets.R;

public class AutoTextExample extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextViewLanguage;
    String []language={"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_text_example);
        autoCompleteTextViewLanguage=findViewById(R.id.auto_text_view_example);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,language);
        arrayAdapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        autoCompleteTextViewLanguage.setThreshold(1);
        autoCompleteTextViewLanguage.setAdapter(arrayAdapter);
        autoCompleteTextViewLanguage.setTextColor(Color.LTGRAY);
    }
}
