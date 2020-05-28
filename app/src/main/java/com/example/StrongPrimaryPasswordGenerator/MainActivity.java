package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btnPassG = findViewById(R.id.btnPassG);
        TextView btnAgeG = findViewById(R.id.btnAge);
        TextView btnQR = findViewById(R.id.btnQR);
        TextView btnStopWatch = findViewById(R.id.btnStopWatch);
        ImageView imageView1 = findViewById(R.id.imageView);
        ImageView imageViewQR = findViewById(R.id.imageQR);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);

        final Intent passPage = new Intent(MainActivity.this, PasswordActivity.class);
        final Intent QRPage = new Intent(MainActivity.this, QRScanner.class);
        final Intent agePage = new Intent(MainActivity.this, AgeCalculaterActivity.class);
        final Intent stopPage = new Intent(MainActivity.this, StopWatchActivity.class);

        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QRPage);
            }
        });
        imageViewQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QRPage);
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(passPage);
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

        btnPassG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(passPage);
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

    }
}
