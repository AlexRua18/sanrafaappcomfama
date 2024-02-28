package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.sanrafa.molde.Hotel;

public class hoteles_ampliados extends AppCompatActivity {

    Hotel datoshotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);
        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, datoshotel.getNombre(), Toast.LENGTH_SHORT).show();
    }
}