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
    Button btn1;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        final TextView txt1 = findViewById(R.id.txt1);
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
                        JSONObject object = new JSONObject(response.toString());
                        String data = object.getString("data");

                        JSONObject object1 = new JSONObject(data);
                        String data1 = object1.getString("timings");

                        JSONObject object2 = new JSONObject(data1);
                        final String Asr = object2.getString("Asr");
                        Log.d(TAG, "run: " + Asr);
                        txt1.setText(Asr);
                        btn1 = findViewById(R.id.btn1);
                        txt2 = findViewById(R.id.txt2);
                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                txt2.setText(Asr);
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
