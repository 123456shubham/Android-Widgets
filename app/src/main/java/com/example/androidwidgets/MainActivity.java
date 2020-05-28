package com.example.androidwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ToggleButton;

import com.example.androidwidgets.Pizza.PizzaExample;
import com.example.androidwidgets.WorkingWithButton.Add;
import com.example.androidwidgets.alert_dialog_box.WarningExample;
import com.example.androidwidgets.auto_text_Example.AutoTextExample;
import com.example.androidwidgets.customToastExample.CustomToastExample;
import com.example.androidwidgets.radioButtonExample.ColourChange;
import com.example.androidwidgets.ratingBar.RatingBarExample;
import com.example.androidwidgets.seekbar.Seek_Bar_Example;
import com.example.androidwidgets.spinerPackage.SpinnerExample;
import com.example.androidwidgets.togglebutton.ToogleButtonExample;
import com.example.androidwidgets.webView.WebViewExample;

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

@BindView(R.id.toggleButton)
Button buttonTogglrbutton;

@BindView(R.id.checkbox_Example)
Button buttoncheckBox;

@BindView(R.id.radioButton)
Button buttonRadiobutton;

@BindView(R.id.alert_dialog_box)
Button buttonAlertBox;

@BindView(R.id.spinner1)
Button buttonSpinner;

@BindView(R.id.auto_text_view)
Button buttonauto;

@BindView(R.id.rating_button)
Button buttonRating;

@BindView(R.id.web_view_button)
Button button_web_view;

@BindView(R.id.seek_bar_button)
Button buttonSeekBar;



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

        @OnClick(R.id.toggleButton)
        public void buttonTogglrbutton(){
        startActivity(new Intent(MainActivity.this, ToogleButtonExample.class));
        }
        @OnClick(R.id.checkbox_Example)
        public void ButtoncheckBox(){
        startActivity(new Intent(MainActivity.this, PizzaExample.class));
        }
        @OnClick(R.id.radioButton)
        public void buttonRadiobutton(){
        startActivity(new Intent(MainActivity.this, ColourChange.class));
        }
        @OnClick(R.id.alert_dialog_box)
        public void buttonAlertBox(){
        startActivity(new Intent(MainActivity.this, WarningExample.class));
        }
        @OnClick(R.id.spinner1)
         public void buttonSpinner(){
        startActivity(new Intent(MainActivity.this, SpinnerExample.class));
        }
        @OnClick(R.id.auto_text_view)
          public  void buttonauto(){
        startActivity(new Intent(MainActivity.this, AutoTextExample.class));
        }
        @OnClick(R.id.rating_button)
         public void buttonRating(){
        startActivity(new Intent(MainActivity.this, RatingBarExample.class));
        }
        @OnClick(R.id.web_view_button)
        public void button_web_view(){
        startActivity(new Intent(MainActivity.this, WebViewExample.class));
        }
        @OnClick(R.id.seek_bar_button)
        public void buttonSeekBar(){
        startActivity(new Intent(MainActivity.this, Seek_Bar_Example.class));
        }
    }

