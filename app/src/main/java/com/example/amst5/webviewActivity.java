package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;


public class webviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String myYouTubeVideoUrl = "https://www.youtube.com/embed/8H40p44oo1U";
        String dataUrl =
                "<html>" +
                        "<body>" +
                        "<h2>Video From YouTube</h2>" +
                        "<br>" +
                        "<iframe width=\"560\" height=\"315\" src=\""+myYouTubeVideoUrl+"\" frameborder=\"0\" allowfullscreen/>" +
                        "</body>" +
                        "</html>";

        WebView myWebView = findViewById(R.id.mWebView);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        myWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.loadData(dataUrl, "text/html", "utf-8");
    }
}