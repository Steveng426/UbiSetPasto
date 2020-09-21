package com.example.ubisetp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TercerFragment extends Fragment {
    TextView atras;
    TextView done;
    ViewPager viewPager;
    public TercerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tercer, container, false);

        View view1 = inflater.inflate(R.layout.activity_main,container,false);

        viewPager = getActivity().findViewById(R.id.viewPager);

        atras=view.findViewById(R.id.IdAtras);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        done=view.findViewById(R.id.IdFin);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio = new Intent(getActivity(),MainActivity.class);
                startActivity(inicio);
            }
        });
        return view;
    }
}

