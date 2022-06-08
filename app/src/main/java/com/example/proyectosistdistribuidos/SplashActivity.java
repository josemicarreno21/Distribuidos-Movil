package com.example.proyectosistdistribuidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();

        Thread background = new Thread(){
            public void run(){
                try {
                    sleep(2500);
                    Intent i = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){
                }
            }
        };
        background.start();

    }
}