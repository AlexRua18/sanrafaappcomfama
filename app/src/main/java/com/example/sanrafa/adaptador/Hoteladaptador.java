package com.example.sanrafa.adaptador;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.hoteles_ampliados;
import com.example.sanrafa.molde.Hotel;
import com.example.sanrafa.molde.Restaurante;
import com.example.sanrafa.molde.Sitio;

import java.util.ArrayList;

public class Hoteladaptador extends RecyclerView.Adapter<Hoteladaptador.viewHolder> {

    //Atributos de la clase

    public ArrayList<Hotel> listaHoteles;

    public Hoteladaptador() {
    }

    public Hoteladaptador(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public Hoteladaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel, null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull Hoteladaptador.viewHolder holder, int position) {
    holder.pintarmolde(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //Asocial mxl molde con objeto
        ImageView Fotomoldehotel;
        TextView nombrehotelmolde;

        TextView preciohotelmolde;



        public viewHolder(@NonNull View itemView) {

            super(itemView);
            Fotomoldehotel = itemView.findViewById(R.id.Fotomoldehotel);
            nombrehotelmolde = itemView.findViewById(R.id.nombrehotelmolde);
            preciohotelmolde = itemView.findViewById(R.id.preciohotelmolde);


        }

        public void pintarmolde(Hotel hotel) {
            Fotomoldehotel.setImageResource(hotel.getFotografia());
            nombrehotelmolde.setText(hotel.getNombre());
            preciohotelmolde.setText(hotel.getPrecio());





            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), hoteles_ampliados.class);
                    intent.putExtra("datoshotel",hotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
