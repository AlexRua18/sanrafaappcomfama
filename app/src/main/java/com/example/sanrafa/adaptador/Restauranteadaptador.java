package com.example.sanrafa.adaptador;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.hoteles_ampliados;
import com.example.sanrafa.molde.Restaurante;
import com.example.sanrafa.restaurantes_ampliados;

import java.util.ArrayList;

public class Restauranteadaptador extends RecyclerView.Adapter<Restauranteadaptador.viewHolder> {

    public ArrayList<Restaurante> Listarestaurantes;

    public Restauranteadaptador() {
    }

    public Restauranteadaptador(ArrayList<Restaurante> listarestaurantes) {
        Listarestaurantes = listarestaurantes;
    }

    @NonNull
    @Override
    public Restauranteadaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante, null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Restauranteadaptador.viewHolder holder, int position) {
        holder.pintarmolde(Listarestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return Listarestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView Fotomolderestaurante;
        TextView nombrerestaurantemolde;

        TextView preciorestaurantemolde;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Fotomolderestaurante = itemView.findViewById(R.id.Fotomolderestaurante);
            nombrerestaurantemolde = itemView.findViewById(R.id.nombrerestaurantemolde);
            preciorestaurantemolde = itemView.findViewById(R.id.preciorestaurantemolde);
        }

        public void pintarmolde(Restaurante restaurante) {
            Fotomolderestaurante.setImageResource(restaurante.getFotografia());
            nombrerestaurantemolde.setText(restaurante.getNombre());
            preciorestaurantemolde.setText(restaurante.getPrecio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), restaurantes_ampliados.class);
                    intent.putExtra("datosrestaurante",restaurante);
                    itemView.getContext().startActivity(intent);
                }
            });
        }

    }
}
