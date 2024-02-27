package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptador.Restauranteadaptador;
import com.example.sanrafa.molde.Hotel;
import com.example.sanrafa.molde.Restaurante;

import java.util.ArrayList;

public class Listarestaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listaRestaurantes =new ArrayList<>();
    RecyclerView recyclerviewRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurantes);

        recyclerviewRestaurantes=findViewById(R.id.listadinamicarestaurantes);
        recyclerviewRestaurantes.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        crearListaRestaurantes();
        Restauranteadaptador adaptador = new Restauranteadaptador();
        recyclerviewRestaurantes.setAdapter(adaptador);
    }
    public void crearListaRestaurantes()
    {
    listaRestaurantes.add(new Restaurante("La Carmela Restaurante","50000-300000","Almuerzo, Cena, Brunch, Abierto hasta tarde, Bebidas","300 9075197","Carrera 30 - 31 78 local 201, Carmen de Viboral",5,R.drawable.restaurante1,"Carnes y asados","Si"));
    listaRestaurantes.add(new Restaurante("Tezenda Restaurante","30000-300000","Bar, Parrillada, Pub, Sudamericana, Colombiana","+57 4 3223932","Km 6.8 Vía La Ceja - Rionegro Mall Tezenda, Carmen de Viboral Colombia",5,R.drawable.restaurante2,"Carnes y asados","Si"));
    listaRestaurantes.add(new Restaurante("Carmelina, Cultura, Felicidad Y Parrilla","30000-300000","Churrasquería, Parrillada, Sudamericana, Colombiana"," 313 6453213","Carrera 33 x Calle 17 Cerca al Parque Educativo",5,R.drawable.restaurante3,"Carnes y asados","Si"));
    listaRestaurantes.add(new Restaurante("La Frisolera","30000-300000","Asiento, Servicio de mesa, Reservas, Acceso para silla de ruedas"," +57 4 5666094","Carrera 30 30 84, Carmen de Viboral",5,R.drawable.restaurante4,"Carnes y asados","Si"));
    listaRestaurantes.add(new Restaurante("Vino al Arte Restaurante","30000-300000","stá calificado por los viajeros de Tripadvisor en las siguientes categorías: Comida: 4.5; Servicio: 4; Calidad/precio: 4.5 "," +57 45436525","El Carmen de Viboral, Antioquia",5,R.drawable.restaurante5,"Vinos","Si"));
    }
}