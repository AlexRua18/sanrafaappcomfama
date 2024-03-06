package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanrafa.molde.Hotel;
import com.example.sanrafa.molde.Sitio;

public class sitios_ampliados extends AppCompatActivity {

    Sitio datossitio;

    TextView tituloSitio;

    ImageView imagenSitio;
    TextView CalificacionSitio;

    TextView descripcionsitiomolde;

    TextView telefonositiomolde;

    TextView direccionsitiomolde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        tituloSitio = findViewById(R.id.tituloampliadositios);
        imagenSitio = findViewById(R.id.Fotoampliadositios);
        CalificacionSitio = findViewById(R.id.calificacionampliandositios);
        descripcionsitiomolde = findViewById(R.id.descripcionsitiosmolde);
        telefonositiomolde = findViewById(R.id.telefonositiosmolde);
        direccionsitiomolde = findViewById(R.id.direccionsitiosmolde);

        datossitio=(Sitio) getIntent().getSerializableExtra("datossitio");
        tituloSitio.setText(datossitio.getNombre());
        imagenSitio.setImageResource(datossitio.getFotografia());
        CalificacionSitio.setText(Integer.toString( datossitio.getCalificacion()));
        descripcionsitiomolde.setText(datossitio.getDescripcion());
        telefonositiomolde.setText(datossitio.getTelefono());
        direccionsitiomolde.setText(datossitio.getDireccion());
    }
}