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

public class PasswordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);
        Button btng = findViewById(R.id.btng);
        final TextView GeneratedN = findViewById(R.id.GeneratedN);
        Button CopyPassword = findViewById(R.id.CopyPassword);
        final EditText enterLength= findViewById(R.id.enterLength);

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i =(random.nextInt(Integer.parseInt(enterLength.getText().toString()))) + (Integer.parseInt(enterLength.getText().toString()))
                        +(Integer.parseInt(enterLength.getText().toString()));
//                random.nextInt();
//                GeneratedN.setText(random.toString());
                GeneratedN.setText(i+"");
            }
        });
        CopyPassword.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("labe", GeneratedN.getText().toString());
                clipboard.setPrimaryClip(clip);

//                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
//                ClipData clip = ClipData.newPlainText(label, text);
//                clipboard.setPrimaryClip(clip);
            }
        });
    }
}
//Random random = new Random(Integer.parseInt(enterLength.getText().toString()));
