package com.example.usuario.ipncard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alumno extends AppCompatActivity {
//el modulo perfil desplegará los datos del alumno
    ImageButton catalogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);
        catalogo = (ImageButton) findViewById(R.id.btnCatalogo);
    }

    public void catalogo(View v){
        Intent intento = new Intent (this, catalogo.class);
        startActivity(intento);
        finish();
    }
}
