package com.davidchura.tiendasperuanas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mbtnCrearCuenta;
    TextView mtvIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        mtvIniciarSesion= findViewById(R.id.tvIniciarSesion);

        mbtnCrearCuenta.setOnClickListener(this);
        mtvIniciarSesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //v.getId() devuelve el id del objeto que gene{o el evento
        switch (v.getId()){
            case R.id.btnCrearCuenta:
                mostrarCrearCuenta();
                break;
            case R.id.tvIniciarSesion:
                mostrarIniciarSesion();
                break;
        }
    }

    private void mostrarIniciarSesion() {
        startActivity(new Intent(this,InicioSesionActivity.class));
    }

    private void mostrarCrearCuenta() {
        startActivity(new Intent(this,CrearCuentaActivity.class));
    }
}











