package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        btnPassG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passPage = new Intent(MainActivity.this, PasswordActivity.class);
                startActivity(passPage);
            }
        });

        btnWeatherG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent weatherPage = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(weatherPage);
            }
        });

        btnAgeG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agePage = new Intent(MainActivity.this, AgeCalculaterActivity.class);
                startActivity(agePage);
            }
        });

        btnStopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stopPage = new Intent(MainActivity.this, StopWatchActivity.class);
                startActivity(stopPage);
            }
        });
        btnDownloader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent downloadPage = new Intent(MainActivity.this, DownloaderActivity.class);
                startActivity(downloadPage);
            }
        });
    }
}
