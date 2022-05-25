package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button irEquipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        irEquipo = findViewById(R.id.irEquipo);

        //TODO Optimizar esta mamada
        irEquipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread background = new Thread(){
                    public void run(){
                        try {
                            sleep(500);
                            Intent i = new Intent(getBaseContext(),EquiposActivity.class);
                            startActivity(i);
                            finish();
                        }catch (Exception e){
                        }
                    }
                };
                background.start();
            }
        });
    }
}