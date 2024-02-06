package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
//Cargar el menu de opciones

public boolean onCreateOptionsMenu(Menu menu){
getMenuInflater().inflate(R.menu.menu,menu);
return true;
}
public boolean onOptionsItemSelected(MenuItem item){
       int itemselecionado=item.getItemId();

      if (itemselecionado == R.id.opcion1)
      {
          Toast.makeText(this, "presiono boton 1", Toast.LENGTH_SHORT).show();
      }else if (itemselecionado == R.id.opcion2){
          Toast.makeText(this, "presiono boton 2", Toast.LENGTH_SHORT).show();
      }else if (itemselecionado == R.id.opcion3){
          Toast.makeText(this, "presiono boton 3", Toast.LENGTH_SHORT).show();
      }else if (itemselecionado == R.id.opcion4){
          Intent intentresena = new Intent(Home.this,Resena.class);
          startActivity(intentresena);
      }else if (itemselecionado == R.id.opcion5){
          Intent intentacerca = new Intent(Home.this,Acercade.class);
          startActivity(intentacerca);
      }
      return super.onOptionsItemSelected(item);
}

}