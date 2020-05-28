package com.example.androidwidgets.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.androidwidgets.R;

public class Seek_Bar_Example extends AppCompatActivity {
SeekBar seekBarExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek__bar__example);
        seekBarExample=findViewById(R.id.seek_bar1);
        seekBarExample.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(Seek_Bar_Example.this,"Seek Bar On Progress"+i,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Seek_Bar_Example.this,"Seek Bar On Start Tracking Touch",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Seek_Bar_Example.this,"Seek Bar On Stop Tracking Touch",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
