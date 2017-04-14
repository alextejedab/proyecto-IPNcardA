package com.example.usuario.ipncard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText contra;
    Button acceso;
    TextView notif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.txtUsuario);
        contra = (EditText) findViewById(R.id.txtContra);
        notif = (TextView) findViewById(R.id.lblNotif);
        acceso = (Button) findViewById(R.id.btnEntrar);
    }

    public void ingresar(View v){
        String user = usuario.getText().toString();
        String psw = contra.getText().toString();
        if(user.equals("2015090750") && psw.equals("1234")) {
            Intent intento = new Intent(this, Alumno.class);
            startActivity(intento);
            finish();
        }
        else{
            notif.setText("USUARIO O CONTRASEÑA INCORRECTO");
        }
    }
}
