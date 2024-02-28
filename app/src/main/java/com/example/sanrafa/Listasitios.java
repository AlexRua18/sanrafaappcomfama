package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptador.Sitioadaptador;
import com.example.sanrafa.molde.Hotel;
import com.example.sanrafa.molde.Sitio;

import java.util.ArrayList;

public class Listasitios extends AppCompatActivity {

    ArrayList<Sitio> listaSitios =new ArrayList<>();

    RecyclerView recyclerviewSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasitios);

        recyclerviewSitios=findViewById(R.id.listadinamicasitios);
        recyclerviewSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        Sitioadaptador adaptador = new Sitioadaptador(listaSitios);
        recyclerviewSitios.setAdapter(adaptador);
    }
    public void crearListaHoteles()
    {
    listaSitios.add(new Sitio("Paseo del Angel ", "50000", "Ernesto perez","Un sitio hermoso, mágico ideal para una buenas fotos y disfrutar de un delicioso café", "3215448689","cll123 #65-89",5,R.drawable.sitio1,"Travel"));
    }
}