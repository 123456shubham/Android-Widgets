package com.example.androidwidgets.ratingBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.androidwidgets.R;

public class RatingBarExample extends AppCompatActivity {
    RatingBar ratingBar1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_example);
        ratingBar1=findViewById(R.id.rating_app);
        button1=findViewById(R.id.rating_submit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating=String.valueOf(ratingBar1.getRating());
                Toast.makeText(RatingBarExample.this,rating,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
