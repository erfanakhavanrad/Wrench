package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button buttonA;
    TextView textView1, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        final String address = "https://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran=8";
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL obj = new URL(address);

                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("User-Agent", "Mozilla/5.0");

                    int responseCode = con.getResponseCode();

                    if (responseCode == HttpURLConnection.HTTP_OK) {

                        BufferedReader in = new BufferedReader(new InputStreamReader(
                                con.getInputStream()));

                        String inputLine;
                        StringBuffer response = new StringBuffer();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }

                        System.out.println(response.toString());


                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
