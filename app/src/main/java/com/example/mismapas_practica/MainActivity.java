package com.example.mismapas_practica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button btn = findViewById(R.id.btnMap1);
    }

    public void irMapa(View v) {
        double latitud, longitud;
        if (v.getId() == R.id.btnMap1) {// Cinta Costera
            latitud = 8.969065612921607;
            longitud = -79.53009818183958;
        } else if (v.getId() == R.id.btnMap2) {//Casco Antiguo
            latitud = 8.952566815852144;
            longitud = -79.5347720210296;
        } else if (v.getId() == R.id.btnMap3) {//Terminal de Albrook
            latitud = 8.974932424862756;
            longitud = -79.55132011296627;
        } else {//Metro Mall
            latitud = 9.052718038431768;
            longitud = -79.45167237660091;
        }
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("latitud", String.valueOf(latitud));
        intent.putExtra("longitud", String.valueOf(longitud));
        startActivity(intent);
    }
}