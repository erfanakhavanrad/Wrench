package com.example.StrongPrimaryPasswordGenerator;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        EasySplashScreen splash = new EasySplashScreen(SplashActivity.this)
                .withFullScreen()
                 .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(500)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withHeaderText("header")
                .withFooterText("footer")
                .withBeforeLogoText("befote")
                .withAfterLogoText("Agter")
                .withLogo(R.mipmap.ic_launcher);
        View RunSplash = splash.create();
        setContentView(RunSplash);
    }
}
