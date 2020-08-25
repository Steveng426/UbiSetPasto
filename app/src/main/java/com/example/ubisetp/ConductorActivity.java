package com.example.ubisetp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ConductorActivity extends AppCompatActivity {
    public static final String user ="name";
    TextView txtuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor);

        txtuser = (TextView) findViewById(R.id.txtholi);
        String user = getIntent().getStringExtra("name");
        txtuser.setText("¡Bienvenido: "+user+"!");

    }
}
