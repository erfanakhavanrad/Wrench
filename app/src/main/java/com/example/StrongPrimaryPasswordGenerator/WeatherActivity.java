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
                        JSONObject object = new JSONObject(response.toString());
                        String data = object.getString("data");

                        JSONObject object1 = new JSONObject(data);
                        String data1 = object1.getString("timings");

                        JSONObject object2 = new JSONObject(data1);
                        final String Sunrise = object2.getString("Sunrise");
                        Log.d(TAG, "run: " + Sunrise);

                        JSONObject object3 = new JSONObject(data1);
                        final String Asr = object3.getString("Asr");
                        Log.d(TAG, "run: " + Asr);

                        JSONObject object4 = new JSONObject(data1);
                        final String Maghrib = object4.getString("Maghrib");
                        Log.d(TAG, "run: " + Maghrib);

                        JSONObject object5 = new JSONObject(data1);
                        final String Isha = object5.getString("Isha");
                        Log.d(TAG, "run: " + Isha);


//                        txt1.setText(Sunrise);
                        buttonA = findViewById(R.id.buttonA);
                        textView1.findViewById(R.id.textView1);
                        textView2.findViewById(R.id.textView2);
                        textView3.findViewById(R.id.textView3);
                        textView4.findViewById(R.id.textView4);

                        buttonA.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textView1.setText(Sunrise + "");
                                textView2.setText(Asr);
                                textView3.setText(Maghrib);
                                textView4.setText(Isha);

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
