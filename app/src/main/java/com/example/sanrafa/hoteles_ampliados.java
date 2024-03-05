package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.molde.Hotel;

public class hoteles_ampliados extends AppCompatActivity {

    Hotel datoshotel;

    TextView tituloHotel;

    ImageView imagenHotel;
    TextView CalificacionHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);
        tituloHotel=findViewById(R.id.tituloampliadohoteles);
        imagenHotel=findViewById(R.id.Fotoampliadohoteles);
        CalificacionHotel = findViewById(R.id.calificacionampliandohoteles);

        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");
        tituloHotel.setText(datoshotel.getNombre());
        imagenHotel.setImageResource(datoshotel.getFotografia());
        CalificacionHotel.setText(Integer.toString( datoshotel.getCalificacion()));
    }
}