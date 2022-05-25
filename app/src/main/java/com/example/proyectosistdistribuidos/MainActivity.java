package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnEquipo1, btnEquipo2;
    Button irCancha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEquipo1 = findViewById(R.id.btnEquipo1);
        btnEquipo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),EquiposActivity.class);
                startActivity(i);
                //finish();
            }
        });

        btnEquipo2 = findViewById(R.id.btnEquipo2);
        btnEquipo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),EquiposActivity.class);
                startActivity(i);
                //finish();
            }
        });

        irCancha = findViewById(R.id.irCanchaInfo);
        irCancha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancha = new Intent(getBaseContext(),CanchaInfo.class);
                startActivity(cancha);
                //finish();
            }
        });

    }
}