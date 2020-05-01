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
import android.widget.Toast;

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
                gen();
                //50
                GeneratedN.setText(gen() + "");
            }
        });

        CopyPassword.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("labe", GeneratedN.getText().toString());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(PasswordActivity.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int gen() {
        Random random = new Random();
        final int MINIMUM;
        Random r = new Random(System.currentTimeMillis());
        String et = enterLength.getText().toString();
        int fet = Integer.parseInt(et);
        MINIMUM = fet;
        int v = random.nextInt(Integer.MAX_VALUE - MINIMUM) + MINIMUM;
        int g = r.nextInt(fet);
        return ((1 + r.nextInt(1)) * fet + r.nextInt(fet));
    }
}
