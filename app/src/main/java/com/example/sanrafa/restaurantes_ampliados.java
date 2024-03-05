package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.molde.Hotel;
import com.example.sanrafa.molde.Restaurante;

public class restaurantes_ampliados extends AppCompatActivity {

    Restaurante datosrestaurante;
    TextView tituloRestaurante;

    ImageView imagenRestaurante;
    TextView Calificacionrestaurante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        tituloRestaurante=findViewById(R.id.tituloampliadoRestaurantes);

        imagenRestaurante=findViewById(R.id.FotoampliadoRestaurantes);

        Calificacionrestaurante = findViewById(R.id.calificacionampliandoRestaurantes);

        datosrestaurante=(Restaurante) getIntent().getSerializableExtra("datosrestaurante");
        tituloRestaurante.setText(datosrestaurante.getNombre());
        imagenRestaurante.setImageResource(datosrestaurante.getFotografia());
        Calificacionrestaurante.setText(Integer.toString( datosrestaurante.getCalificacion()));
    }
}