package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btnPassG = findViewById(R.id.btnPassG);
        TextView btnWeatherG = findViewById(R.id.textView10);
        TextView btnAgeG = findViewById(R.id.btnAge);
        TextView btnDownloader = findViewById(R.id.btnDownloader);
        TextView btnStopWatch = findViewById(R.id.btnStopWatch);
        ImageView imageView1 = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        final Intent passPage = new Intent(MainActivity.this, PasswordActivity.class);
        final Intent weatherPage = new Intent(MainActivity.this, WeatherActivity.class);
        final Intent agePage = new Intent(MainActivity.this, AgeCalculaterActivity.class);
        final Intent stopPage = new Intent(MainActivity.this, StopWatchActivity.class);
        final Intent downloadPage = new Intent(MainActivity.this, DownloaderActivity.class);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(passPage);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(weatherPage);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(agePage);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(stopPage);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(downloadPage);
            }
        });

        btnPassG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(passPage);
            }
        });

        btnWeatherG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(weatherPage);
            }
        });

        btnAgeG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(agePage);
            }
        });

        btnStopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(stopPage);
            }
        });
        btnDownloader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(downloadPage);
            }
        });
    }
}
