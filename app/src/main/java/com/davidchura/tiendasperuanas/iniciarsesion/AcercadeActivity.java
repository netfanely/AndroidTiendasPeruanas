package com.davidchura.tiendasperuanas.iniciarsesion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.davidchura.tiendasperuanas.R;

public class AcercadeActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton mrbQuienesSomos, mrbMision, mrbVision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        mrbQuienesSomos = findViewById(R.id.rbQuienesSomos);
        mrbMision = findViewById(R.id.rbMision);
        mrbVision = findViewById(R.id.rbVision);

        mrbQuienesSomos.setOnClickListener(this);
        mrbMision.setOnClickListener(this);
        mrbVision.setOnClickListener(this);

        mrbQuienesSomos.setChecked(true);
        mostrarQuienenesSomos();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.rbQuienesSomos:
                mostrarQuienenesSomos();
                break;
            case R.id.rbMision:
                mostrarMision();
                break;
            case R.id.rbVision:
                mostrarVision();
                break;
        }
    }

    private void mostrarQuienenesSomos(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor, new QuienesSomosFragment()) //dentro del contenedor cambiar una instancia
                .commit();
    }
    private void mostrarMision(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor, new MisionFragment()) //dentro del contenedor cambiar una instancia
                .commit();
    }
    private void mostrarVision(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor, new VisionFragment()) //dentro del contenedor cambiar una instancia
                .commit();
    }

}
