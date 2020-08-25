package com.example.ubisetp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    ViewPager viewPager;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        viewPager = findViewById(R.id.viewPager);
        IntroAdapter adapter = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

    }
}
