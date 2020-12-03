package com.example.conexaodobem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AcaoSocial extends AppCompatActivity {
    TextView txdralegria, txclbfuturo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acao_social);
        carregaWidgets();
        Clickdralegria();
        Clickclbesporte();

    }

    private void carregaWidgets() {
        txdralegria = findViewById(R.id.txtdralegria);
        txclbfuturo = findViewById(R.id.txtesporteclube);
    }

    private void Clickdralegria() {
        txdralegria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AcaoSocial.this, doutoresdaalegria.class);
                startActivity(it);

            }
        });


    }
    public void Clickclbesporte(){
        txclbfuturo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AcaoSocial.this,EsporteClubeFuturo.class);
                startActivity(it);
            }
        });
    }
}
