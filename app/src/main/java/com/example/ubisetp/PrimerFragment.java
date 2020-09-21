package com.example.ubisetp;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrimerFragment extends Fragment {
    TextView next;
    ViewPager viewPager;
    MediaPlayer mediaPlayer,mediaPlayer2;



    public PrimerFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mediaPlayer = MediaPlayer.create(this.getActivity(),R.raw.hola);
        mediaPlayer2 = MediaPlayer.create(this.getActivity(),R.raw.quieres);


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_primer, container, false);

        //inicializar ViewPager desde mainActivity
        viewPager = getActivity().findViewById(R.id.viewPager);
        mediaPlayer.start();

        next=view.findViewById(R.id.IdSiguiente);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
                mediaPlayer2.start();
            }
        });
        return view;
    }
}
