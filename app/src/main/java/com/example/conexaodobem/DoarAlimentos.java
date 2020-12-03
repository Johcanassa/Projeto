package com.example.conexaodobem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoarAlimentos extends AppCompatActivity {
    TextView txgaadi, txLardosidoso,txAlojamento,txSopao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar_alimentos);
        carregaWidgets();
        carregatelaGaadi();
        carregatelaLardosIdosos();
        carregaTelaAlojamento();
        carregaTelaSopao();
    }

    private void carregaTelaSopao() {
        txSopao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarAlimentos.this,SopaoComunitario.class);
                startActivity(it);
            }
        });
    }

    private void carregaTelaAlojamento() {
        txAlojamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarAlimentos.this,AlojamentoComunitario.class);
                startActivity(it);
            }
        });

    }

    private void carregatelaLardosIdosos() {
        txLardosidoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(DoarAlimentos.this,LardosIdosos.class);
                startActivity(it);
            }
        });
    }

    private void carregaWidgets() {
        txgaadi = findViewById(R.id.txtgaadi);
        txLardosidoso = findViewById(R.id.txtmelhoridade);
        txAlojamento = findViewById(R.id.txtalojamento);
        txSopao = findViewById(R.id.txtsopao);
    }

    private void carregatelaGaadi() {
        txgaadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarAlimentos.this, Gaadi.class);
                startActivity(it);

            }
        });
    }
}
