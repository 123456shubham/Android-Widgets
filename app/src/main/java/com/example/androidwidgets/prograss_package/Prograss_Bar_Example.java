package com.example.androidwidgets.prograss_package;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.androidwidgets.R;

public class Prograss_Bar_Example extends AppCompatActivity {
    Button button_downloading;
    ProgressDialog progressBar;
   private int  progressBarstatus=0;
   private Handler handler=new Handler();
   private long fileSize=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prograss__bar__example);
        button_downloading=findViewById(R.id.download_file);
        button_downloading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar=new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("Downloading File");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.show();

              new Thread(new Runnable() {
                  @Override
                  public void run() {
                     while (progressBarstatus<100){
                         progressBarstatus=doOperation();
                         try{
                             Thread.sleep(1000);
                         }catch (Exception e){
                             e.printStackTrace();
                         }
                         // Updating The Progressing Bar
                         handler.post(new Runnable() {
                             @Override
                             public void run() {
                                 // sleeping for 1 second after operation completed

                                 progressBar.setProgress(progressBarstatus);
                             }

                         });
                         if(progressBarstatus>=100){
                             // sleeping for 1 second after operation completed
                             try {
                                 Thread.sleep(1000);
                             } catch (InterruptedException e) {
                                 e.printStackTrace();
                             }
                             progressBar.dismiss();
                         }

                     }
                  }
              }).start();


            }
        });
    }
    public int doOperation(){
        while(fileSize<=1000){
            fileSize++;
        }
        if(fileSize==1000) {
            return 10;
        }else if(fileSize==2000) {
            return 20;
        }else if(fileSize==3000){
            return 30;
        }
        return 100;
    }
}
