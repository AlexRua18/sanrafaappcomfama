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
        crearListaHoteles();

        Sitioadaptador adaptador = new Sitioadaptador(listaSitios);
        recyclerviewSitios.setAdapter(adaptador);
    }
    public void crearListaHoteles()
    {
    listaSitios.add(new Sitio("Paseo del Angel ", "50000", "Ernesto perez","Un sitio hermoso, mágico ideal para una buenas fotos y disfrutar de un delicioso café", "3215448689","cll123 #65-89",5,R.drawable.sitio1,"Travel"));
    listaSitios.add(new Sitio("Cerámicas Esmaltarte ", "60000", "Ernesto perez","Fabricación y Venta de las mejores vajillas decoradas a mano de El Carmen de Viboral. En estas piezas está impresa la labor y el esfuerzo de un grupo de artesanos que día a dia con sus manos dan vida a cada pieza como si fuera uno mas de sus hijos. Los productos de Cerámicas Esmaltarte tiene ", "3213259876","cll124 #67-29",5,R.drawable.sitio2,"Travel"));
    listaSitios.add(new Sitio("Museo vivo de la cerámica El Dorado", "100000", "Ernesto perez","Recorrido turístico dedicado a mostrarle al mundo el hermoso proceso artesanal de fabricación de Cerámicas El Dorado. A partir de ahora podrás visitarnos en el Carmen de Viboral, Antioquia, conocer nuestra fábrica , y vivir la experiencia de ver cómo nuestros artesanos fabrican y decoran con cada trazo, amor y dedicación cada pieza.", "3219856219","cll896 #78-88",5,R.drawable.sitio3,"Fabricas"));
    listaSitios.add(new Sitio("Iglesia San Antonio de Pereira", "100000", "Ernesto perez","Una hermosa catedral, hay que visitarla, los lugareños son personas amables, brindan pura buena onda.", "3218796525","cll87c #89-15",5,R.drawable.sitio4,"Iglesias y catedrales"));
    listaSitios.add(new Sitio("La Continental Cervecería Artesanal", "150000", "Ernesto perez","La Continental, una de las fábricas de cerámica más emblemáticas de El Carmen de Viboral permanece en la memoria y en las conversaciones de esquina del pueblo.", "3219851236","cll96c #96-5",5,R.drawable.sitio5,"Tours y degustacion"));
    }
}