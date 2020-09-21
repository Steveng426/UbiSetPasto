package com.example.ubisetp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RutaActivity extends AppCompatActivity {

    ArrayList<RutaVo> listaRutas;
    RecyclerView recyclerRutas;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta);
        mediaPlayer = MediaPlayer.create(this,R.raw.seleccionec12);

        listaRutas=new ArrayList<>();
        recyclerRutas=findViewById(R.id.IdRecycler);
        recyclerRutas.setLayoutManager(new LinearLayoutManager(this));

        llenarRutas();

        AdaptadorLista adaptadorLista = new AdaptadorLista(listaRutas);

        adaptadorLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+listaRutas.
                        get(recyclerRutas.getChildAdapterPosition(view)).getNombreRuta(),Toast.
                        LENGTH_SHORT).show();
                //Redireccionar a otra actividad
                Intent mapa = new Intent(RutaActivity.this, MapaRutaActivity.class );
                mediaPlayer.start();
                startActivity(mapa);
            }

        });

        recyclerRutas.setAdapter(adaptadorLista);
    }

    private void llenarRutas() {
        //Base de datos Estatica
        listaRutas.add(new RutaVo("  Ruta Complementaria C1","  Descripcion:","  -------------------",R.drawable.c1));
        listaRutas.add(new RutaVo("  Ruta Complementaria C2","  Descripcion:","  -------------------",R.drawable.c2));
        listaRutas.add(new RutaVo("  Ruta Complementaria C3","  Descripcion:","  -------------------",R.drawable.c3));
        listaRutas.add(new RutaVo("  Ruta Complementaria C4","  Descripcion:","  -------------------",R.drawable.c4));
        listaRutas.add(new RutaVo("  Ruta Complementaria C5","  Descripcion:","  -------------------",R.drawable.c5));
        listaRutas.add(new RutaVo("  Ruta Complementaria C6","  Descripcion:","  -------------------",R.drawable.c6));
        listaRutas.add(new RutaVo("  Ruta Complementaria C7","  Descripcion:","  -------------------",R.drawable.c7));
        listaRutas.add(new RutaVo("  Ruta Complementaria C8","  Descripcion:","  -------------------",R.drawable.c8));
        listaRutas.add(new RutaVo("  Ruta Complementaria C9","  Descripcion:","  -------------------",R.drawable.c9));
        listaRutas.add(new RutaVo("  Ruta Complementaria C10","  Descripcion:","  -------------------",R.drawable.c10));
        listaRutas.add(new RutaVo("  Ruta Complementaria C11","  Descripcion:","  -------------------",R.drawable.c11));
        listaRutas.add(new RutaVo("  Ruta Complementaria C12","  Descripcion:","  Comienza desde Briseño y termina en Briseño",R.drawable.c12));
        listaRutas.add(new RutaVo("  Ruta Complementaria C13","  Descripcion:","  -------------------",R.drawable.c13));
        listaRutas.add(new RutaVo("  Ruta Complementaria C14","  Descripcion:","  -------------------",R.drawable.c14));
        listaRutas.add(new RutaVo("  Ruta Complementaria C15","  Descripcion:","  -------------------",R.drawable.c15));
        listaRutas.add(new RutaVo("  Ruta Complementaria C16","  Descripcion:","  -------------------",R.drawable.c16));
        listaRutas.add(new RutaVo("  Ruta Estrategica E1","  Descripcion:","  -------------------",R.drawable.e1));
        listaRutas.add(new RutaVo("  Ruta Estrategica E2","  Descripcion:","  -------------------",R.drawable.e2));
        listaRutas.add(new RutaVo("  Ruta Estrategica E3","  Descripcion:","  -------------------",R.drawable.e3));
        listaRutas.add(new RutaVo("  Ruta Estrategica E4","  Descripcion:","  -------------------",R.drawable.e4));
        listaRutas.add(new RutaVo("  Ruta Estrategica E5","  Descripcion:","  -------------------",R.drawable.e5));
        listaRutas.add(new RutaVo("  Ruta Estrategica E6","  Descripcion:","  -------------------",R.drawable.e6));
        listaRutas.add(new RutaVo("  Ruta Estrategica E7","  Descripcion:","  -------------------",R.drawable.e7));
    }
}
