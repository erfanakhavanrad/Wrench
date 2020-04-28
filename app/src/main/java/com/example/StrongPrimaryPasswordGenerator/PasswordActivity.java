package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class PasswordActivity extends AppCompatActivity {
    EditText enterLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        Button btng = findViewById(R.id.btng);
        final TextView GeneratedN = findViewById(R.id.GeneratedN);
        Button CopyPassword = findViewById(R.id.CopyPassword);
        enterLength = findViewById(R.id.enterLength);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                gen();

                GeneratedN.setText(gen() + "");
            }
        });
        CopyPassword.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("labe", GeneratedN.getText().toString());
                clipboard.setPrimaryClip(clip);
            }
        });
    }


    public int gen() {
        Random r = new Random(System.currentTimeMillis());
//        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        String et = enterLength.getText().toString();
        int fet = Integer.parseInt(et);

        int g = r.nextInt(fet);
        return ((1 + r.nextInt(2)) * 10000) + g;
    }
}
