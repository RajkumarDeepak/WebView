package com.example.android.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    String url="http://rkdeepak.com/";
    WebView view = (WebView)this.findViewById(R.id.WebView);
    view.getSettings().setJavaScriptEnabled(true);
    view.loadUrl(url);
  }
}
