package com.example.ubisetp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton mapa;
    ImageButton acerca;
    ImageButton ruta;
    ImageButton conductor;
    ImageButton configuracion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mapa= (ImageButton)findViewById(R.id.imageButton1);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapa = new Intent(MainActivity.this, MapsActivity.class );
                startActivity(mapa);
            }
        });

        ruta= (ImageButton)findViewById(R.id.imageButton2);
        ruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ruta = new Intent(MainActivity.this, RutaActivity.class );
                startActivity(ruta);
            }
        });

        acerca= (ImageButton)findViewById(R.id.imageButton4);
        acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acerca = new Intent(MainActivity.this, AboutActivity.class );
                startActivity(acerca);
            }
        });

        conductor= (ImageButton)findViewById(R.id.imageButton3);
        conductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conductor = new Intent(MainActivity.this, LoginActivity.class );
                startActivity(conductor);
            }
        });

        configuracion= (ImageButton)findViewById(R.id.imageButton5);
        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conductor = new Intent(MainActivity.this, SettingsActivity.class );
                startActivity(conductor);
            }
        });
    }
}
