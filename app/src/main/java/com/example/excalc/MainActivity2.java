package com.example.excalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tV;
    Intent gi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tV = (TextView) findViewById(R.id.tV);
        gi = getIntent();
        double x = gi.getDoubleExtra("n",-1);
        tV.setText(x + "");
    }

    public void clicked(View view) {
        finish();
    }
}
