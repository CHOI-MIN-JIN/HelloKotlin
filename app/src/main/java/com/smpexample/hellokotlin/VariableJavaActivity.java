package com.smpexample.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount = 0;
    long startTime = System.currentTimeMillis();
    long elapsedSeconds;

    TextView txtActivityStartTime;
    TextView txtCountBtnClicks;
    Button btnClickMe;
    TextView txtElapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        btnClickMe = findViewById(R.id.btnClickMe);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount += 1;
                txtCountBtnClicks.setText("Button clicks: " + clickCount);
                txtElapsedTime.setText(elapsedSeconds + "seconds elapsed");
            }
        });
        //Activity Start Time:
        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + timeText);
        txtCountBtnClicks.setText("Button clicks: " + clickCount);
        elapsedSeconds = (long) ((System.currentTimeMillis() - startTime) / 1000.0);
        txtElapsedTime.setText(elapsedSeconds + "seconds elapsed");
    }
}