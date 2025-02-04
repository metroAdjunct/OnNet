package edu.msudenver.cs3013.onnet

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        setContentView(webView)

        webView.loadUrl("https://www.google.com")

    }
}