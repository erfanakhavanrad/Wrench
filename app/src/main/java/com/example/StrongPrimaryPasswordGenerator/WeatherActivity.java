package com.example.StrongPrimaryPasswordGenerator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.StrongPrimaryPasswordGenerator.Model;
import com.example.StrongPrimaryPasswordGenerator.R;
import com.google.gson.Gson;

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
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        buttonA = findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(" طلوع خورشید " + "05:58");
                textView2.setText(" عصر " + "16:48");
                textView3.setText(" اذان مغرب " + "20:04");
                textView4.setText(" العشا " + "21:26");
                getData();
            }
        });

    }

    private void getData() {
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

//                        System.out.println(response.toString());
                        Log.d("Response", response.toString());
                        Model model = new Gson().fromJson(response.toString(), Model.class);
                        textView1.setText(" طلوع خورشید " + model.getData().getTimings().getSunrise());
                        textView2.setText(" عصر " + model.getData().getTimings().getAsr());
                        textView3.setText(" اذان مغرب " + model.getData().getTimings().getMaghrib());
                        textView4.setText(" العشا " + model.getData().getTimings().getIsha());

                    }
                } catch (Exception e) {
                    e.printStackTrace();

                    textView1.setText(" طلوع خورشید " + "05:58");
                    textView2.setText(" عصر " + "16:48");
                    textView3.setText(" اذان مغرب " + "20:04");
                    textView4.setText(" العشا " + "21:26");
                }
            }
        });
        thread.start();
    }
}