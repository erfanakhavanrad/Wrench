package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPassG = findViewById(R.id.btnPassG);
        Button btnWeatherG = findViewById(R.id.btnWeatherG);
        Button btnAgeG = findViewById(R.id.btnAgeG);
        Button btnDownloader = findViewById(R.id.btnDownloader);
        Button btnStopWatch = findViewById(R.id.btnStopWatch);

        btnPassG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passPage = new Intent(MainActivity.this, PasswordsActivity.class);
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
