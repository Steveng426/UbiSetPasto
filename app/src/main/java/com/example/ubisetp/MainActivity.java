package com.example.ubisetp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton mapa;
    ImageButton acerca;
    ImageButton ruta;
    ImageButton conductor;
    ImageButton configuracion;
    MediaPlayer mediaPlayer,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5;

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.mapa);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.rutas);
        mediaPlayer3 = MediaPlayer.create(this,R.raw.conductor);
        mediaPlayer4 = MediaPlayer.create(this,R.raw.acerca);
        mediaPlayer5 = MediaPlayer.create(this,R.raw.configuracion);

         mapa= (ImageButton)findViewById(R.id.imageButton1);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapa = new Intent(MainActivity.this, MapsActivity.class );
                mediaPlayer.start();
                startActivity(mapa);
            }
        });

        ruta= (ImageButton)findViewById(R.id.imageButton2);
        ruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ruta = new Intent(MainActivity.this, RutaActivity.class );
                mediaPlayer2.start();
                startActivity(ruta);
            }
        });

        acerca= (ImageButton)findViewById(R.id.imageButton4);
        acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acerca = new Intent(MainActivity.this, AboutActivity.class );
                mediaPlayer4.start();
                startActivity(acerca);
            }
        });

        conductor= (ImageButton)findViewById(R.id.imageButton3);
        conductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conductor = new Intent(MainActivity.this, LoginActivity.class );
                mediaPlayer3.start();
                startActivity(conductor);
            }
        });

        configuracion= (ImageButton)findViewById(R.id.imageButton5);
        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conductor = new Intent(MainActivity.this, SettingsActivity.class );
                mediaPlayer5.start();
                startActivity(conductor);
            }
        });
    }
}
