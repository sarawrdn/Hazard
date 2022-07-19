package com.example.hazard;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        String path = "https://www.astroawani.com/topic/bencana-alam";
        webView = findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(path);
    }
    @Override
    public void onBackPressed() {
        if (webView.copyBackForwardList().getCurrentIndex() > 0) {
            webView.goBack();
        }
        else {
            // Your exit alert code, or alternatively line below to finish
            super.onBackPressed(); // finishes activity
        }
    }
}
