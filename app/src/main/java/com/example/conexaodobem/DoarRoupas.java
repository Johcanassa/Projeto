package com.example.conexaodobem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoarRoupas extends AppCompatActivity {
    TextView txgaadi, txLardosidoso,txAlojamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar_roupas);
        carregaWidgets();
        carregatelaGaadi();
        carregatelaLardosIdosos();
        carregaAlojamento();
    }

    private void carregaAlojamento() {
        txAlojamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(DoarRoupas.this,AlojamentoComunitario.class);
                startActivity(it);
            }
        });

    }

    private void carregatelaLardosIdosos() {
        txLardosidoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =new Intent(DoarRoupas.this,LardosIdosos.class);
                startActivity(it);
            }
        });
    }

    private void carregaWidgets() {
        txgaadi = findViewById(R.id.txtgaadi);
        txLardosidoso = findViewById(R.id.txtmelhoridade);
        txAlojamento = findViewById(R.id.txtalojamento);
    }

    private void carregatelaGaadi() {
        txgaadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DoarRoupas.this, Gaadi.class);
                startActivity(it);

            }
        });
    }
}







