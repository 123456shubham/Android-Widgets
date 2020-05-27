package com.example.androidwidgets.alert_dialog_box;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidwidgets.R;

public class WarningExample extends AppCompatActivity {
Button buttonWarrning;
AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning_example);

        buttonWarrning=findViewById(R.id.alert_dialog_box1);
        alert=new AlertDialog.Builder(WarningExample.this);
        buttonWarrning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.setMessage("Welcome To Alert Dialog Box ").setTitle("Alert Dialog Box");
                alert.setMessage("Do you want to close this application ?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(),"you choose yes action for alert box",
                                Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                   dialogInterface.cancel();
                    }
                });
            }
        });

        // Creating Alert Dailog Box
        AlertDialog alertDialog=alert.create();
        alertDialog.setIcon(R.drawable.ic_warning_black_24dp);
        alertDialog.setTitle("AlertDialogExample");
        alertDialog.setMessage("Are You Sure To Exit This Page ");
        alertDialog.show();


    }
}
