package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoeAqui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doe_aqui);

        Button btnroupas = (Button) findViewById(R.id.btnroupa);
        Button btncalcados = (Button) findViewById(R.id.btncalçados);
        Button btnbrinquedos = (Button) findViewById(R.id.btnbrinquedos);
        Button btncobertores = (Button) findViewById(R.id.btncobertores);
        Button btnalimentos = (Button) findViewById(R.id.btnalimentos);
        Button btnmoveis = (Button) findViewById(R.id.btnmoveis);
        Button btneletro = (Button) findViewById(R.id.btneletro);
        Button btntrabvoluntario = (Button) findViewById(R.id.btnvoluntario);

        btnroupas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarRoupas.class);
                startActivity(it);
            }
        });
        btncalcados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarCalcados.class);
                startActivity(it);
            }
        });
        btnmoveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarMoveis.class);
                startActivity(it);
            }
        });

        btneletro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarEletro.class);
                startActivity(it);
            }
        });
        btnbrinquedos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarBrinquedos.class);
                startActivity(it);
            }
        });
        btncobertores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarCobertores.class);
                startActivity(it);
            }
        });
        btnalimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, DoarAlimentos.class);
                startActivity(it);
            }
        });
        btntrabvoluntario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoeAqui.this, TrabalhoVoluntario.class);
                startActivity(it);


            }
        });
    }
}
