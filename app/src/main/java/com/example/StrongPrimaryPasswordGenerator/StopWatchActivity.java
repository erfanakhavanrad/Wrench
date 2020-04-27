package com.example.StrongPrimaryPasswordGenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        final ImageView icanchor = findViewById(R.id.icanchor);
        final Button btnStart = findViewById(R.id.btnStart);
        final Button btnStop = findViewById(R.id.btnStop);
        final Chronometer timeHere = findViewById(R.id.timeHere);

//        create optional animation
        btnStop.setAlpha(0);

//        Load animation
        final Animation roundingalone = AnimationUtils.loadAnimation(this, R.anim.roundingalone);

//        import font
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "medium.ttf");
//        customize font
        btnStart.setTypeface(MMedium);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                passing animation
                icanchor.startAnimation(roundingalone);
                btnStop.animate().alpha(1).setDuration(300).start();
                btnStart.animate().alpha(0).setDuration(300).start();
                //start time
                timeHere.setBase(SystemClock.elapsedRealtime());
                timeHere.start();
            }
        });
    }
}
