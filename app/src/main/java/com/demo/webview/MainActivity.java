package com.demo.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setTextZoom(100);
        wv.addJavascriptInterface(new WebAppInterface(this), "android");
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("file:///android_asset/html/index.html");
//        wv.loadUrl("https://m.naver.com/");
    }
}