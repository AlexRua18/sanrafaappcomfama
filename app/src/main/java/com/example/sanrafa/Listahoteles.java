package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptador.Hoteladaptador;
import com.example.sanrafa.molde.Hotel;

import java.util.ArrayList;

public class Listahoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles =new ArrayList<>();

    RecyclerView recyclerviewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);

        recyclerviewHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerviewHoteles.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        crearListaHoteles();
        Hoteladaptador adaptador = new Hoteladaptador(listaHoteles);
        recyclerviewHoteles.setAdapter(adaptador);
    }
    public void crearListaHoteles()
    {
        listaHoteles.add(new Hotel("Apartamento la Arcilla","500000$","Apartamento la Arcilla se encuentra en Carmen de Viboral, a 35 km de Piedra del Peñol, y ofrece terraza, jardín y wifi gratis. Este apartamento está a 43 km de Parque El Poblado y a 43 km de Parque Lleras.","3215265599"," 3212 Calle 30, 054030 Carmen de Viboral, Colombia",5,R.drawable.hotel1));
        listaHoteles.add(new Hotel("Hotel Bicentenario Rionegro","600000$","Hotel Bicentenario Rionegro está en Rionegro, a 31 km de Parque El Poblado y a 31 km de Parque Lleras. Este hotel de 3 estrellas tiene wifi gratis.","3236589654"," Carrera 51 # 47 - 25 , 054040 Rionegro, Colombia ",5,R.drawable.hotel2));
        listaHoteles.add(new Hotel("BubbleSky Glamping","800000$","BubbleSky Glamping 15 min from Medellin dispone de bañera de hidromasaje y parking privado gratis, y está a 22 km de Parque El Poblado y a 22 km de Parque Lleras.","3236589654","  Variante Las Palmas km 7  ",5,R.drawable.hotel3));
        listaHoteles.add(new Hotel("Travelers Rio Verde Living Suites","900000$","El Rio Verde Living Suites se encuentra en Rionegro, a 35 km de Medellín, y dispone de solárium y sauna. Guatapé está a 32 km.","3236589654","  KM 1 VIA AEROPUERTO - LLANO GRANDE,  ",5,R.drawable.hotel4));
        listaHoteles.add(new Hotel("TEVA Glamping & Retreat","1000000$","TEVA Glamping & Retreat está a 20 km de Parque El Poblado y ofrece alojamiento con restaurante, jardín, salón de uso común y terraza. El tented camp ofrece wifi y parking privado, ambos gratis.","3236589654","  Vereda Sajonia kilometro 22 via santa elena,  ",5,R.drawable.hotel5));
        listaHoteles.add(new Hotel("Hotel Santiago de ArmaSe abre en una ventana nueva\n","1000000$","El Hotel Santiago de Arma se encuentra en Rionegro y alberga un restaurante a la carta. Ofrece conexión Wi-Fi gratuita, servicio de habitaciones y aparcamiento privado gratuito.","3236589654","  Glorieta Aeropuerto Jose Maria Cordoba ",5,R.drawable.hotel6));
    }
}