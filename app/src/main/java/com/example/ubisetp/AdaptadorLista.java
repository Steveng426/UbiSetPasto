package com.example.ubisetp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.ViewHolderlista>
implements View.OnClickListener{

    ArrayList<RutaVo> listaRuta;
    private View.OnClickListener listener;


    public AdaptadorLista(ArrayList<RutaVo> listaRuta) {
        this.listaRuta = listaRuta;
    }

    @Override
    public ViewHolderlista onCreateViewHolder( ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.elemento_lista,null,false);

        view.setOnClickListener(this);
        return new ViewHolderlista(view);
    }

    @Override
    public void onBindViewHolder( ViewHolderlista holder, int position) {
        holder.etiNombreRuta.setText(listaRuta.get(position).getNombreRuta());
        holder.etiDescripccion.setText(listaRuta.get(position).getDescripcion());
        holder.etiInfoo.setText(listaRuta.get(position).getInfo());
        holder.imagen.setImageResource(listaRuta.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return listaRuta.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolderlista extends RecyclerView.ViewHolder {

        TextView etiNombreRuta, etiDescripccion,etiInfoo;
        ImageView imagen;
        public ViewHolderlista(View itemView) {
            super(itemView);
            etiNombreRuta=(TextView) itemView.findViewById(R.id.IdTextRuta);
            etiDescripccion=(TextView) itemView.findViewById(R.id.IdTextDescripcion);
            etiInfoo=(TextView) itemView.findViewById(R.id.IdTextInfo);
            imagen=(ImageView) itemView.findViewById(R.id.Idimagen);

        }
    }
}
