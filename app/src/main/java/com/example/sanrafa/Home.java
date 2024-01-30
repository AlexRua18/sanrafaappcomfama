package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //Atributos para referenciar elementos graficos
    // que tengo yo en el xml que quiero controlar en java
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonStios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //asociar las variables creadas con los id de los elementos que viene de xml
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonStios=findViewById(R.id.botonsitios);

        //escuchar eventos (toques de los botones)

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Home.this, "Hizo clic en Hoteles", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Home.this, "Hizo clic en Restaurantes", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, Restaurantes.class);
                startActivity(intent);
            }
        });

        botonStios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Home.this, "Hizo clic en Sitios", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this, Sitios.class);
                startActivity(intent);
            }
        });
    }
}