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
import com.example.sanrafa.molde.Sitio;
import com.example.sanrafa.restaurantes_ampliados;
import com.example.sanrafa.sitios_ampliados;

import java.util.ArrayList;

public class Sitioadaptador extends RecyclerView.Adapter<Sitioadaptador.viewHolder> {

    public ArrayList<Sitio> ListaSitios;

    public Sitioadaptador() {
    }

    public Sitioadaptador(ArrayList<Sitio> listaSitios) {
        ListaSitios = listaSitios;
    }

    @NonNull
    @Override
    public Sitioadaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios, null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Sitioadaptador.viewHolder holder, int position) {
        holder.pintarmolde(ListaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return ListaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView Fotomoldesitios;
        TextView nombresitiosmolde;

        TextView contactositiomolde;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Fotomoldesitios = itemView.findViewById(R.id.Fotomoldesitios);
            nombresitiosmolde = itemView.findViewById(R.id.nombresitiosmolde);
            contactositiomolde = itemView.findViewById(R.id.contactositiomolde);
        }

        public void pintarmolde(Sitio sitio) {
            Fotomoldesitios.setImageResource(sitio.getFotografia());
            nombresitiosmolde.setText(sitio.getNombre());
            contactositiomolde.setText(sitio.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), sitios_ampliados.class);
                    intent.putExtra("datossitio",sitio);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
