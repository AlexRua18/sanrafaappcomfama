package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Restaurantes extends AppCompatActivity {

    ImageButton botonVerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        botonVerRestaurantes=findViewById(R.id.botonhomerestaurantes);

        botonVerRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurantes.this, Listarestaurantes.class);
                startActivity(intent);
            }
        });
    }
}