package com.example.androidwidgets.webView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.androidwidgets.R;

public class WebViewExample extends AppCompatActivity {
WebView webViewExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_example);
        webViewExample=findViewById(R.id.web_view_example1);
        webViewExample.loadUrl("https://www.facebook.com");
    }
}
